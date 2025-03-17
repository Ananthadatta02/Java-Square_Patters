# Square Pattern Program

## Description
This Java program generates a hollow square star pattern based on user input. The user provides the size of the square (`n`), and the program prints a square of `n × n` dimensions. The first and last rows contain only `*` characters, while the middle rows have `*` at the beginning and end, with spaces in between. The nested loops iterate through rows and columns, checking boundary conditions (`i == 0`, `j == 1`, `i == n - 1`, `j == n`) to print `*` or spaces accordingly. It utilizes `Scanner` for input and `System.out.print` for output formatting.

## Code
```java
package star_patterns;

import java.util.Scanner;

public class SquarePattern
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = s.nextInt();
        
        for(int i = 0; i < n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                if(i == 0 || j == 1 || i == n - 1 || j == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
```

## Explanation
### 1. Scanner Input
- The program uses `Scanner s = new Scanner(System.in);` to take user input.
- The user is prompted with `System.out.println("Enter the size");`.
- The entered value is stored in the variable `n` using `int n = s.nextInt();`.

### 2. Variables Used
- `n`: Stores the size of the square pattern entered by the user.
- `i`: Used in the outer loop to control row iteration.
- `j`: Used in the inner loop to control column iteration.

### 3. For Loop (Outer Loop)
- `for(int i = 0; i < n; i++)` iterates through each row.
- It ensures the loop runs `n` times (from `0` to `n-1`).

### 4. Nested For Loop (Inner Loop)
- `for(int j = 1; j <= n; j++)` iterates through each column of the row.
- It ensures the loop runs `n` times (from `1` to `n`).

### 5. Conditions
- `if(i == 0 || j == 1 || i == n - 1 || j == n)`: This condition checks if the current position is on the boundary.
  - `i == 0`: First row.
  - `j == 1`: First column.
  - `i == n - 1`: Last row.
  - `j == n`: Last column.
- If any of these conditions are true, `*` is printed.
- Otherwise, spaces (`"  "`) are printed to create the hollow effect.

### 6. Printing Statements
- `System.out.print("* ");` prints the star with spacing for proper alignment.
- `System.out.print("  ");` prints spaces to create the hollow effect.
- `System.out.println();` moves to the next line after printing a row.

## Example Output
### Input
```
Enter the size
5
```
### Output
```
* * * * *
*       *
*       *
*       *
* * * * *
```

## Usage
- Run the program in a Java-supported environment.
- Enter an integer `n` to define the square size.
- The program will print a hollow square pattern of `n × n` dimensions.

## Notes
- The program ensures proper alignment using spaces.
- Uses `Scanner` for dynamic input handling.
- Runs efficiently using nested loops for pattern printing.

## Clone
```
git clone https://github.com/Ananthadatta02/Java-Square_Patters.git
```
