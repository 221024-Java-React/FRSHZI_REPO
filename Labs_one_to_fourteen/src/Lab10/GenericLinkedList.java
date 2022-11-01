package Lab10;

public class GenericLinkedList<T> {

	public int length;
	private Node<T> head;

	public GenericLinkedList() {
		this.length = 0;
		this.head = null;
	}

	public void add(T data) {
		Node<T> node = new Node<T>(data);

		if (this.head == null) {
			this.head = node;
		} else {

			Node<T> n = this.head;
			while (n.getNext() != null) {
				n = n.getNext();
			}

			n.setNext(node);
		}

		length++;
	}

	public void remove(int index) {

		if (index == 0) {
			this.head = this.head.getNext();
		}

		else {

			Node<T> n = head;

			for (int i = 0; i < index - 1; i++) {
				try {
					n = n.getNext();
					if (n.getNext() == null)
						throw new NullPointerException();
				} catch (NullPointerException e) {
					throw new IndexOutOfBoundsException();
				}
			}

			Node<T> n1 = n;

			Node<T> n2 = n.getNext().getNext();

			n1.setNext(n2);

			length--;
		}
	}

	public T get(int index) {
		if (index == 0) {
			return head.getData();
		} else {
			Node<T> n = head;
			for (int i = 0; i < index; i++) {
				try {
					n = n.getNext();
					if (n == null)
						throw new NullPointerException();
				} catch (NullPointerException e) {
					throw new IndexOutOfBoundsException();
				}
			}
			return n.getData();
		}
	}
}
