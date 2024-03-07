package accidentPack;

public class Node {
	int leftChildren;
	int rightChildren;
	public Report data;
	public Node left = null;
	public Node right = null;
	
	public Node (Report r) {
		this.data = r;
		findRightChildren();
		findLeftChildren();
	}
	
	/**
	 *If the node has no left node, 0 is returned. Otherwise, 
	 *1 + findLeftChildren + findRightChildren of the left node is returned.
	 * @return
	 */
	public int findLeftChildren() {
		if (this.left == null) {
			this.leftChildren = 0;
		} else {
			this.leftChildren = 1 + (this.left.findLeftChildren() + this.left.findRightChildren());
		}
		return this.leftChildren;
	}
	
	/**
	 *If the node has no right node, 0 is returned. Otherwise, 
	 *1 + findLeftChildren + findRightChildren of the right node is returned.
	 * @return
	 */
	public int findRightChildren() {
		if (this.right == null) {
			this.rightChildren = 0;
		} else {
			this.rightChildren = 1 + (this.right.findLeftChildren() + this.right.findRightChildren());
		}
		return this.rightChildren;
	}
	
	
	/**
	 * A method for adding one node to another node in the context of a tree.
	 * If node n happened the after node this,
	 * then node n is made to be this.right if this.right is null. If this.right is not null,
	 * then the function is recursively called on this.right. If node n happened before node this,
	 * then node n is made to be this.left if this.left is null. If this.left is not null,
	 * then the function is recursively called on this.right.
	 * @param n
	 */
	public void addNode (Node n) {
		if (n.data.getStartTime()[0] < this.data.getStartTime()[0]) {//this happened the year after n
			if (this.left == null) {
			this.left = n; } else {
				this.left.addNode(n);
			}
		} else if (n.data.getStartTime()[0] > this.data.getStartTime()[0]) {//this happened the year before n
			if (this.right == null) {
				this.right = n; } else {
					this.right.addNode(n);
				}
		} else {//this happened the same year as n
			if (n.data.getStartTime()[1] < this.data.getStartTime()[1]) {//this happened the month after n
				if (this.left == null) {
				this.left = n; } else {
					this.left.addNode(n);
				}
			} else if (n.data.getStartTime()[1] > this.data.getStartTime()[1]) {//this happened the month before n
				if (this.right == null) {
					this.right = n; } else {
						this.right.addNode(n);
					}
			} else {//this happened the same month as n
				if (n.data.getStartTime()[2] < this.data.getStartTime()[2]) {//this happened the day after n
					if (this.left == null) {
					this.left = n; } else {
						this.left.addNode(n);
					}
				} else if (n.data.getStartTime()[2] >= this.data.getStartTime()[2]) {//this happened the day before n OR the same day
					if (this.right == null) {
						this.right = n; } else {
							this.right.addNode(n);
						}
				}
			}
		}
		
		findRightChildren();
		findLeftChildren();

	}
	

}
