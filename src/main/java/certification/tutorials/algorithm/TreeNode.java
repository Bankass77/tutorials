package certification.tutorials.algorithm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class TreeNode {

	
	public int value;
	public TreeNode left;
	public TreeNode right;

	
	public TreeNode(int val) {
		this.value=val;
		this.left= new TreeNode();
		this.right=new TreeNode();

	}
	
	
	
}
