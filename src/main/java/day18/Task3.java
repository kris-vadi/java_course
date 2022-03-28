package day18;

public class Task3 {
    public static void main(String[] args) {
        Node root = new Node(20);

        int[] numbers = {14, 23, 11, 16, 22, 27, 5, 15, 18, 24, 150, 8};

        for (int number: numbers) {
            addNode(number, root);
        }

        dfs(root);
    }

    private static void addNode(int value, Node root) {
        Node currentNode = null;
        Node nextNode = root;

        while (nextNode != null) {
            currentNode = nextNode;

            if (currentNode.getValue() >= value)
                nextNode = currentNode.getRightSon();
            else
                nextNode = currentNode.getLeftSon();
        }

        if (currentNode.getValue() >= value)
            currentNode.setRightSon(new Node(value));
        else
            currentNode.setLeftSon(new Node(value));
    }

    private static void dfs(Node node) {
        if (node == null)
            return;

        dfs(node.getRightSon());
        System.out.print(node.getValue() + " ");
        dfs(node.getLeftSon());
    }
}