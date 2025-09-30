
/*
 * 
 * Description:
 * 
 * A demo class for the Car class
 * 
 * This is a multi-line comment
 * 
 * 
 * Add information here for context, such as:
 *  - Requirements
 *  - Known bugs
 *  - Homework number or other useful info for grading
 * 
 * I would suggest not including personal information in your source code, 
 * such as your name and EWU ID
 * This is because when you submit your code, 
 * you will submit it via Canvas and Github, so I already know who you are
 * and for your career, you will collaborate on code, 
 * so one class might have many contributors. 
 * Additionally, expect your code to be reused and modified and perhaps even open source
 * If you are concerned about your intellectual property, look into licensing (e.g. MIT)
 * 
*/


/* 
 * 
 * Citations:
 * 
 *  - When we create new software, we are standing on the shoulders of giants.
 *  - Let's acknowledge this by citing references when we copy/paste or use any code or text that we didn't write ourselves.
 *  - I'll demonstrate this in this class by
 *    1) adding a comment With a list of references
 *    2) citing any parts of the class, including comments, with a alphanumeric expression, linking that code or comment with the reference
 *  
 *  - For example, in your code, use [1] whenever you are citing the source defined in your list of references as 1
 *  - You can use a, b, c, or 1, 2, 3, or whatever lookup you prefer, as long as every time you cite a source, you
 *  - maintain a corresponding citation to that source
 *  
 * 
 * If you cite a book, include the page number either in the list of references or in your citation itself
 * If you cite a website, include the URL in your list of references
 * 
 * For citing Generative-AI (such as LLMs, ChatGPT, Copilot, etc). I'm going to suggest a framework that
 * roughly follows MLA but not really. I am not that concerned with the format. I am more concerned with the following:
 *  - Prompt (if any): n/a
 *  - Source: Copilot4Eclipse Plugin
 *  - Model: GPT-4.1 Copilot
 * 
 * Feel free to develop your own style in terms of do you list the specific pages in your references section,
 * and add a link when you cite it, or do you include the page number in your citation. It's up to you.
 * This is not a research or English literature class. I just want you to get in the habit of citing your sources.
 * 
 * For any AI-generated code, you must cite it. If you use more than ONE (1) logical operation or statement, you must 
 * write in your own words without referring to it describe what it is doing for each operation and why.
 * If you do not, you will get a grade of 0.
 * The first line must be a line stating that any AI assistance is temporarily turned off. Example:
 * 
 * AI OFF
 * [3]
 * First the input parameter points is divided by the input parameter total and stored in variable score
 * Then the score parameter is multiplied by 100 to get percent and stored in scorePercent
 * This is my own idiosyncratic writing style. Maybe I use em dash maybe I don't but I wrote this by myself
 * Then the scorePercent variable is returned. This is the grade out of 100 points
 * 
 */

/*
 * 
 * References:
 * None
 */


/*
 * 
 * References:
 * 
 * 1. Baesens, Bart, et al. Beginning Java Programming : The Object-Oriented Approach. 1st ed., Wrox, 2015.
 * 2. Oracle. "Packages." *Java Tutorials*, Oracle, n.d., https://docs.oracle.com/javase/tutorial/java/concepts/package.html. Accessed 28 Sept. 2025.
 * 3. n/a, Copilot4Eclipse Plugin, Copilot4Eclipse plugin, GPT-4.1 Copilot
 * 
 */


/* 
 * Packages are a Java construct that function something like folders to organize your classes, but
 * offer additional features like namespace and access control. Chapter 3 is about using Eclipse and
 * other development environments. In that chapter, packages were discussed briefly. Indeed in your
 * project directory, packages serve as an organizational tool to keep related classes together and less
 * related classes separate. [1 p. 251]
 * 
 * A package is a namespace that organizes a set of related classes and interfaces. 
 * Conceptually you can think of packages as being similar to different folders on your computer. 
 * You might keep HTML pages in one folder, images in another, and scripts or applications in yet another. 
 * Because software written in the Java programming language can be composed of hundreds or thousands of individual classes, 
 * it makes sense to keep things organized by placing related classes and interfaces into packages. [2]
 * 
 * 
 */
package demo1; // make sure this class is in the "demo1" directory. Can we make a demo1.example1 package?

/**
 * A Car class
 * 
 * Use the Javadoc syntax for specific documentation on a part of your code. Use the regular comments (single and multi-line) for other comments.
 * 
 */
public class Car extends Vehicle {
	
	/**
	 * Indicates whether the car is working [3]
	 */
	private Boolean working; // Wrapper Boolean class
	
	public boolean totalled; // Primitive boolean type
	
	/*
	 * what's the difference between wrapper and primitive? 
	 * what if we need to convert the primitive to the wrapper, or vice versa?
	 */
	
	private boolean moving;
	
	private double speed;
	
	
	
	public Car() {
		super(4);
		working = true;
		totalled = false;
		moving = false;
		speed = 0.0;
	}
	
	public void move(double speed) {
		if (working && !totalled) {
			moving = true;
			this.speed = speed;
		}
	}
	
	// speed up?
	// slow down?
	
	/**
	 * AI OFF
	 * [3]
	 * Generated stop method with public visibility and no return type
	 * Sets the moving variable to false, and speed to 0. This is the definition of the car stopping.
	 */
	public void stop() {
		moving = false;
		speed = 0.0;
	}

}

