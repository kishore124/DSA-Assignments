package in.ineuron;

/**
 * The tower of Hanoi is a famous puzzle where we have three rods and N disks.
 * The objective of the puzzle is to move the entire stack to another rod. You
 * are given the number of discs N. Initially, these discs are in the rod 1. You
 * need to print all the steps of discs movement so that all the discs reach the
 * 3rd rod. Also, you need to find the total moves.Note: The discs are arranged
 * such that the top disc is numbered 1 and the bottom-most disc is numbered N.
 * Also, all the discs have different sizes and a bigger disc cannot be put on
 * the top of a smaller disc. Refer the provided link to get a better clarity
 * about the puzzle.
 * 
 * Input: N = 3 
 * Output: 
 * move disk 1 from rod 1 to rod 3 
 * move disk 2 from rod 1 to rod 2 
 * move disk 1 from rod 3 to rod 2
 * move disk 3 from rod 1 to rod 3 
 * move disk 1 from rod 2 to rod 1 
 * move disk 2 from rod 2 to rod 3 
 * move disk 1 from rod 1 to rod 3 
 * 7 
 * Explanation:For N=3 ,
 * steps will be as follows in the
 * example and total 7 steps will be taken.
 */
public class Question_6 {

	public static void main(String[] args) {

		int n = 3;
		int res[] = new int[1];
		System.out.println("A is rod 1 B is rod 2 C is rod 3");
		towerOfHanoi(n, 'A', 'B', 'C', res);
		System.out.println("Result is " + res[0]);
		
	}
   
	public static void towerOfHanoi(int n, char src, char aux, char dest, int[] arr) {

		if (n == 1) {
			arr[0]++;
			System.out.println( "Source "+src + " ->" +"Destination -> "+ dest);
			return;
		}
		towerOfHanoi(n - 1, src, dest, aux, arr);
		towerOfHanoi(1, src, aux, dest, arr);
		towerOfHanoi(n - 1, aux, src, dest, arr);

	}
}
