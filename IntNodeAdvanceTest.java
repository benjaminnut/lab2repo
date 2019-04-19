
public class IntNodeAdvanceTest {

	public static void main(String[] args) {
		
		IntNode cursorNode = new IntNode();
		
		IntNode nextTest = new IntNode(2,cursorNode);
		
		IntNode moreTests = new IntNode (2, nextTest);
		
		nextTest.addNodeAfter(4); 
		
		nextTest.addNodeAfter(3);
		
		nextTest.addNodeAfter(6);
		
		nextTest.addNodeAfter(9); 
		
		System.out.println(IntNode.copyOdd(nextTest));
		
		System.out.println("Original List: " + nextTest);
		
		System.out.println(IntNode.sumLast(nextTest,3));
		
		moreTests.addNodeAfter(4); 
			
		System.out.println(moreTests);
		
		System.out.println(IntNode.removeAll(moreTests,3));
		
		System.out.println(IntNode.removeAll(moreTests,2));
		
		System.out.println("Reversed Array: " + IntNode.reverse(nextTest));
		
		System.out.println(IntNode.hasCycle(moreTests));
		
		System.out.println(IntNode.listEvenNumber(moreTests));

	}

}
