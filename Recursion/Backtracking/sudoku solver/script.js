document.addEventListener("DOMContentLoaded", function () {
    const boardElement = document.getElementById("sudoku-board");

    // Create the Sudoku board
    for (let i = 0; i < 81; i++) {
        const input = document.createElement("input");
        input.setAttribute("type", "number");
        input.setAttribute("min", "1");
        input.setAttribute("max", "9");
        boardElement.appendChild(input);
    }

    const solveButton = document.getElementById("solve-btn");
    const resetButton = document.getElementById("reset-btn");

    // Get the board input and start solving
    solveButton.addEventListener("click", function () {
        const inputs = boardElement.querySelectorAll("input");
        const board = [];
        for (let i = 0; i < 9; i++) {
            board[i] = [];
            for (let j = 0; j < 9; j++) {
                let val = inputs[i * 9 + j].value;
                board[i][j] = val === "" ? 0 : parseInt(val);
            }
        }

        if (solveSudoku(board)) {
            displayBoard(board);
        } else {
            alert("No solution found.");
        }
    });

    // Reset the board
    resetButton.addEventListener("click", function () {
        const inputs = boardElement.querySelectorAll("input");
        inputs.forEach(input => input.value = "");
    });

    // Display the solved board
    function displayBoard(solvedBoard) {
        const inputs = boardElement.querySelectorAll("input");
        for (let i = 0; i < 9; i++) {
            for (let j = 0; j < 9; j++) {
                inputs[i * 9 + j].value = solvedBoard[i][j];
            }
        }
    }

    // Sudoku solving logic
    function solveSudoku(board) {
        let emptySpot = findEmptySpot(board);
        if (!emptySpot) {
            return true; // Puzzle solved
        }
        let [row, col] = emptySpot;

        for (let num = 1; num <= 9; num++) {
            if (isSafe(board, row, col, num)) {
                board[row][col] = num;
                if (solveSudoku(board)) {
                    return true;
                }
                board[row][col] = 0; // Backtrack
            }
        }
        return false;
    }

    function findEmptySpot(board) {
        for (let row = 0; row < 9; row++) {
            for (let col = 0; col < 9; col++) {
                if (board[row][col] === 0) {
                    return [row, col];
                }
            }
        }
        return null;
    }

    function isSafe(board, row, col, num) {
        // Check the row
        for (let i = 0; i < 9; i++) {
            if (board[row][i] === num) {
                return false;
            }
        }

        // Check the column
        for (let i = 0; i < 9; i++) {
            if (board[i][col] === num) {
                return false;
            }
        }

        // Check the 3x3 subgrid
        let startRow = Math.floor(row / 3) * 3;
        let startCol = Math.floor(col / 3) * 3;
        for (let i = 0; i < 3; i++) {
            for (let j = 0; j < 3; j++) {
                if (board[startRow + i][startCol + j] === num) {
                    return false;
                }
            }
        }
        return true;
    }
});
