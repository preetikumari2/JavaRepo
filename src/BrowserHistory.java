/* public class BrowserHistory {
    class Node {
        Node prev, next;
        String url;
        Node(String url) {
            prev = null;
            next = null;
            this.url = url;
        }
    }

    Node currentNode;
    public BrowserHistory(String homepage) {
        currentNode = new Node(homepage);
    }

    public void visit(String url) {
        Node tempNode = new Node(url);
        currentNode.next = tempNode;
        tempNode.prev = currentNode;
        currentNode = currentNode.next;
    }

    public String back(int steps) {
        while(currentNode.prev != null && steps --> 0){
            currentNode = currentNode.prev;
        }
        return currentNode.url;
    }

    public String forward(int steps) {
        while(currentNode.next != null && steps --> 0){
            currentNode = currentNode.next;
        }
        return currentNode.url;
    }

    public static void main(String[] args) {
        Node n = new Node("facebook.com");
        BrowserHistory browserHistory = new BrowserHistory("visit");
        browserHistory.visit("youTube.com");
        String Google = "visit";
        new BrowserHistory("visit").visit(Google);
        System.out.println("Google.com");
        new BrowserHistory("visit").back(2);
        System.out.println(2);
        new BrowserHistory("visit").forward(2);
        System.out.println(2);

    }
}

 */

