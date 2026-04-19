class Solution {

    public int[][] solution(int n) {
        int[][] arr = new int[n][n];

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        int x = 0, y = 0, dir = 0;

        for (int i = 1; i <= n * n; i++) {
            arr[x][y] = i;

            // 다음 위치 계산
            int[] next = getNext(x, y, dir, dx, dy, arr, n);

            x = next[0];
            y = next[1];
            dir = next[2];
        }

        return arr;
    }

    // 다음 좌표 + 방향 결정
    private int[] getNext(int x, int y, int dir, int[] dx, int[] dy, int[][] arr, int n) {
        int nx = x + dx[dir];
        int ny = y + dy[dir];

        // 범위 벗어나거나 이미 값 있으면 방향 전환
        if (nx < 0 || ny < 0 || nx >= n || ny >= n || arr[nx][ny] != 0) {
            dir = (dir + 1) % 4;
            nx = x + dx[dir];
            ny = y + dy[dir];
        }

        return new int[]{nx, ny, dir};
    }
}