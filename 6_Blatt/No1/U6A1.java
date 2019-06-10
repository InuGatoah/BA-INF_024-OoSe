

class DoubleNode {
	private double val;
	private DoubleNode nextNode;

	public DoubleNode() {
	}

	public DoubleNode(double d) {
		val = d;
	}

	public void setNextNode(DoubleNode node) {
		nextNode = node;
	}

	public DoubleNode getNextNode() {
		return nextNode;
	}

	public double getValue() {
		return val;
	}

	public String toString() {
		return "(" + val + ")";
	}

}



class DoubleList {
	
	private DoubleNode head;

	public void add(double d) {
		if (head == null)
			head = new DoubleNode(d);
		else {
			DoubleNode current = head;
			while (current.getNextNode() != null)
				current = current.getNextNode();
			current.setNextNode(new DoubleNode(d));
		}
	}

	public void insertFirst(double d) {
		DoubleNode newNode = new DoubleNode(d);
		newNode.setNextNode(head);
		head = newNode;
	}

	public DoubleNode get(int i) {

		DoubleNode ret = head;

		for (int j = 0; j <= i; j++) {
			if (ret == null)
				return null;
			ret = ret.getNextNode();
		}

		return ret;
	}

	@Override
	public String toString() {
		
		StringBuffer buf = new StringBuffer();

		DoubleNode current = head;

		while (current != null) {
			buf.append(current.getValue());

			if (current.getNextNode() != null)
				buf.append("; ");

			current = current.getNextNode();
		}

		return buf.toString();
	}

	public void remove(int i) {

		// Sonderfall 0 einzeln behandeln
		if (i == 0)
			head = head != null ? head.getNextNode() : null;
		else {

			DoubleNode node = head;

			for (int j = 1; j < i; j++) {
				node = node.getNextNode();

				if (node == null)
					return;
			}
			// setze i-ten Knoten auf Nachfolger oder auf Null, falls kein Nachfolger
			// existiert
			node.setNextNode(node.getNextNode() != null ? node.getNextNode().getNextNode() : null);
		}
	}
}



public class U6A1 {

	public static void main(String[] args) {
		DoubleList list = new DoubleList();
		list.add(42);
		list.add(0xDEADBEEF);
		list.add(-1);
		list.insertFirst(2018);
		list.insertFirst(8);
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		System.out.println(list.get(0));
	}

}


