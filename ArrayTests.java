import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test 
	public void testReverseInPlaceSize4() {
    int[] input1 = {1, 2, 3, 4};
    ArrayExamples.reverseInPlace(input1);
    System.out.println();
    System.out.println("testReverseInPlaceSize4 Output array:");
    for (int i = 0; i < input1.length; i++) {
      System.out.println(input1[i]);
    }
    assertArrayEquals(new int[]{4, 3, 2, 1}, input1);
	}

  @Test 
	public void testReversedSize4() {
    int[] input1 = {1, 2, 3, 4};
    int[] output = ArrayExamples.reversed(input1);
    System.out.println();
    System.out.println("testReversedSize4 Output array:");
    for (int i = 0; i < output.length; i++) {
      System.out.println(output[i]);
    }
    assertArrayEquals(new int[]{4, 3, 2, 1}, output);
	}
}
