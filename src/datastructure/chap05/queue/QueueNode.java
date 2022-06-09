package datastructure.chap05.queue;

public class QueueNode {

    private int item;
    private QueueNode link;

    

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public QueueNode getLink() {
        return link;
    }

    public void setLink(QueueNode link) {
        this.link = link;
    }
}
