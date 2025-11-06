import java.util.*;

class Solution {
    public int[] processQueries(int c, int[][] connections, int[][] queries) {
        int[] parent = new int[c + 1];
        for (int i = 1; i <= c; i++) parent[i] = i;

        for (int[] conn : connections) {
            int a = find(parent, conn[0]);
            int b = find(parent, conn[1]);
            if (a != b) parent[b] = a;
        }

        Map<Integer, TreeSet<Integer>> gridOnline = new HashMap<>();
        for (int i = 1; i <= c; i++) {
            int root = find(parent, i);
            gridOnline.putIfAbsent(root, new TreeSet<>());
            gridOnline.get(root).add(i);
        }

        int[] result = new int[(int) Arrays.stream(queries).filter(q -> q[0] == 1).count()];
        int idx = 0;

        for (int[] q : queries) {
            int type = q[0], x = q[1];
            int root = find(parent, x);

            if (type == 2) {
                gridOnline.get(root).remove(x);
            } else {
                if (gridOnline.get(root).contains(x)) {
                    result[idx++] = x;
                } else {
                    if (gridOnline.get(root).isEmpty()) {
                        result[idx++] = -1;
                    } else {
                        result[idx++] = gridOnline.get(root).first();
                    }
                }
            }
        }

        return result;
    }

    private int find(int[] parent, int x) {
        if (parent[x] != x) parent[x] = find(parent, parent[x]);
        return parent[x];
    }
}
