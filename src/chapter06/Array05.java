package chapter06;

import java.util.*;

public class Array05 {
    public static void main(String[] args) {
        // Scanner 클래스를 이용하여 콘솔로부터 사용자 입력을 받을 수 있는 scanner 객체를 생성합니다.
        Scanner scanner = new Scanner(System.in);

        // 2차원 배열로 미로를 표현합니다. 0: 길, 1: 벽, 2: 시작점, 3: 출구
        int[][] maze = {
                {2, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 0, 1},
                {1, 1, 1, 1, 1, 0, 3},
                {1, 1, 1, 1, 1, 1, 1}
        };

        // 플레이어의 시작 위치를 지정합니다. 여기서는 미로의 시작점을 나타내는 2가 있는 위치입니다.
        int x = 0; // 플레이어의 현재 행 위치
        int y = 0; // 플레이어의 현재 열 위치

        // 무한 루프를 사용하여 플레이어가 출구를 찾을 때까지 게임을 계속 진행합니다.
        while (true) {
            // 미로를 화면에 출력합니다.
            for (int i = 0; i < maze.length; i++) {
                for (int j = 0; j < maze[i].length; j++) {
                    // 플레이어의 현재 위치를 P로 표시합니다.
                    if (i == x && j == y) System.out.print("P ");
                        // 벽을 ■로 표시합니다.
                    else if (maze[i][j] == 1) System.out.print("■ ");
                        // 출구를 E로 표시합니다.
                    else if (maze[i][j] == 3) System.out.print("E ");
                        // 길은 공백으로 표시합니다.
                    else System.out.print("  ");
                }
                System.out.println();
            }

            // 사용자에게 이동 방향을 입력받습니다.
            System.out.println("W/A/S/D 키를 이용하여 움직이세요: ");
            String move = scanner.nextLine();
            // 입력받은 이동 방향에 따라 플레이어의 위치를 업데이트합니다.
            switch (move.toUpperCase()) {
                case "W": if (x > 0 && maze[x-1][y] != 1) x--; break; // 위로 이동
                case "S": if (x < maze.length-1 && maze[x+1][y] != 1) x++; break; // 아래로 이동
                case "A": if (y > 0 && maze[x][y-1] != 1) y--; break; // 왼쪽으로 이동
                case "D": if (y < maze[0].length-1 && maze[x][y+1] != 1) y++; break; // 오른쪽으로 이동
            }

            // 플레이어가 출구에 도달했는지 확인합니다.
            if (maze[x][y] == 3) {
                System.out.println("축하합니다! 미로 탈출을 성공했습니다!");
                break; // 출구에 도달했다면 게임을 종료합니다.
            }
        }
    }
}
