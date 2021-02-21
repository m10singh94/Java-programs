public class Percolation
{
    private int[][] id;
    private int[] sz;

    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n)
    {
        int count = 1;
        for(int i = 1; i <= n; i++)
            for(int j = 1; j <= n; j++)
            {
                id[i][j] = count++;
            }    
    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col)
    {

    }
    
    // is the site (row, col) open?
    public boolean isOpen(int row, int col)
    {

    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col)
    {

    }

    // returns the number of open sites
    public int numberOfOpenSites()
    {

    }

    // does the system percolate?
    public boolean percolates()
    {

    }

    // test client (optional)
    public static void main(String[] args)
    {
        
    }
}