class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        n = len(board)
        cols = [[] for i in range(n)]
        sub_box_1 = []
        sub_box_2 = []
        sub_box_3 = []
        stop = False

        for i in range(n):
        #  Rule 1
            row = []
            for j in range(n):
                if board[i][j] == ".":
                    continue
                else:
                    if board[i][j] in row:
                        return False
                    row.append(board[i][j])
        # Rule 2
            for c in range(n):
                if board[i][c] == ".":
                    continue
                else:
                    if board[i][c] in cols[c]:
                        return False
                    cols[c].append(board[i][c])
        # Rule 3
            for k in range(n):
                if k in range(0,3):
                    if board[i][k] == ".":
                        continue
                    if board[i][k] in sub_box_1:
                        return False
                    sub_box_1.append(board[i][k])
                elif k in range(3,6):
                    if board[i][k] == ".":
                        continue
                    if board[i][k] in sub_box_2:
                        return False
                    sub_box_2.append(board[i][k])
                elif k in range(6,n):
                    if board[i][k] == ".":
                        continue
                    if board[i][k] in sub_box_3:
                        return False
                    sub_box_3.append(board[i][k])
            if i==2 or i==5:
                sub_box_1.clear()
                sub_box_2.clear()
                sub_box_3.clear()
        return True
        