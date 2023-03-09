/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Recursive {
       // Assuming n-th disk is
// bottom disk (count down)

	
static void tower(int n, char sourcePole,
				char destinationPole, char auxiliaryPole)
{
	// Base case (termination condition)
	if (0 == n)
	return;

	// Move first n-1 disks from source pole
	// to auxiliary pole using destination as
	// temporary pole
	tower(n - 1, sourcePole, auxiliaryPole,
						destinationPole);

	// Move the remaining disk from source
	// pole to destination pole
	System.out.printf("Move the disk %d from %c to %c\n",
						n, sourcePole, destinationPole);

	// Move the n-1 disks from auxiliary (now source)
	// pole to destination pole using source pole as
	// temporary (auxiliary) pole
	tower(n - 1, auxiliaryPole, destinationPole, sourcePole);
}

public static void main(String[] args)
{
	tower(3, 'S', 'D', 'A');
}
}



    

