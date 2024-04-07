package ch.mhf.list;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 * Implementation of double linked list with iterator
 *
 * @param <E>
 */
public class LinkedList<E> extends ListBasic<E> implements List<E>
{

    private Node head;
    private Node tail;
    private int length;

    public LinkedList()
    {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    @Override
    public int size()
    {
        return length;
    }

    @Override
    public boolean isEmpty()
    {
        return length == 0; // head == null
    }

    @Override
    public E get(int index)
    {
        if (index < 0 || index > this.length)
            throw new IndexOutOfBoundsException();

        Node<E> curr = head;
        for (int i = 0; i < index; i++)
        {
            curr = curr.next;
        }
        return (E) curr.element;
    }

    @Override
    public E set(int index, E element)
    {
        if (index < 0 || index > this.length)
            throw new IndexOutOfBoundsException();

        Node<E> current = new Node<E>(element);
        if (index == 0) // insert at start
        {
            current.next = head.next;
            current.prev = null;
            head = current;
        } else if (index == this.length - 1) // insert at end
        {
            current.next = null;
            current.prev = tail;
            tail = current;
        } else
        {                    // general case
            Node<E> nodeRef = head;
            for (int i = 1; i < index; i++)
                nodeRef = nodeRef.next;

            nodeRef = current;
        }
        return (E) current.element;
    }

    @Override
    public boolean add(E element)
    {
        boolean isOk = false;
        //Create a new node
        Node newNode = new Node(element);
        // if first insertion tail should
        // also point to this node
        if (isEmpty())
        {
            head = newNode;
        } else
        {
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;
        this.length++;

        return isOk;
    }

    @Override
    public void add(int index, E element)
    {
        if (index < 0 || index > this.length)
            throw new IndexOutOfBoundsException();

        Node<E> newNode = new Node<E>(element);

        if (index == 0) // insert at start
        {
            insertFirst(element);
        } else if (index == this.length) // insert at end
        {
            insertLast(element);
        } else
        {
            // general case
            Node<E> current = head;
            for (int j = 0; j < index && current.next != null; j++)
            {
                current = current.next;
            }

            newNode.next = current;
            current.prev.next = newNode;
            newNode.prev = current.prev;
            current.prev = newNode;
            this.length++;
        }
    }

    public boolean contains(Object o)
    {
        boolean contains = false;
        Node<E> current = head;

        while (current != null)
        {
            if (Objects.equals(current.element, o))
            {
                contains = true;
                break;
            }
            current = current.next;
        }
        return contains;
    }

    @Override
    public E remove(int index)
    {

        if (index < 0 || index >= this.length)
            throw new IndexOutOfBoundsException();

        Node current = head;
        //remove at the start
        if (index == 0)
        {
            if (head.next == null)
            {
                tail = null;
            } else
            {
                // previous of next node (new first) becomes null
                head.next.prev = null;
            }
            head = head.next;
        }
        // remove at last
        else if (index == this.length - 1)
        {
            if (head.next == null)
            {
                head = null;
            } else
            {
                // next of previous node (new last) becomes null
                tail.prev.next = null;
            }
            tail = tail.prev;

        } else
        {
            for (int j = 0; j < index && current.next != null; j++)
            {
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }

        this.length--;

        return (E) current.element;
    }

    @Override
    public boolean remove(Object o)
    {
        Node<E> current = head;
        boolean isOk = false;
        int iterator = 0;
        try
        {
            while (current != null)
            {
                if (Objects.equals(current, o))
                {
                    isOk = true;
                    break;
                }
                current = current.next;
                iterator++;
            }

            if (isOk)
                remove(iterator);
            else
                System.out.println("could not find object to remove");

        } catch (Exception e)
        {
            System.out.println("could not remove object: " + e);
            isOk = false;
        }

        return isOk;
    }

    @Override
    public void clear()
    {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    // return Head
    public Node getHead()
    {
        return head;
    }

    // return Tail
    public Node getTail()
    {
        return tail;
    }

    @Override
    public Iterator<E> iterator()
    {
        return new LinkedListIterator(this);
    }

    private void insertLast(E element)
    {
        Node<E> newNode = new Node<E>(element);
        // if first insertion head should
        // also point to this node
        if (isEmpty())
        {
            head = newNode;
        } else
        {
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;
        this.length++;
    }

    private void insertFirst(E element)
    {
        //Create a new node
        Node<E> newNode = new Node<E>(element);
        // if first insertion tail should
        // also point to this node
        if (isEmpty())
        {
            tail = newNode;
        } else
        {
            head.prev = newNode;
        }
        newNode.next = head;
        head = newNode;
        this.length++;
    }

    // Die anderen Methoden des List-Interfaces müssen nicht implementiert werden.

///////////////////////////////////////////////////


    private static class Node<E>
    {
        private E element;
        private Node<E> prev;
        private Node<E> next;

        public Node(E data, Node<E> next, Node<E> prev)
        {
            this.prev = prev;
            this.next = next;
            this.element = data;
        }

        public Node(E data)
        {
            this.element = data;
        }

        public E getData()
        {
            return element;
        }

        public Node<E> getNext()
        {
            return next;
        }

    }

    /**
     * Iterator class for Linked List
     * is constructed with linked list instance because of mutable object,
     * we can have impact on origin Object
     * @param <E>
     */
    private class LinkedListIterator<E> implements Iterator<E>
    {
        Node<E> current;
        private LinkedList<E> originList;

        // initialize pointer to head of the list for iteration
        public LinkedListIterator(LinkedList<E> list)
        {
            originList = list;
            current = list.getHead();
        }

        @Override
        public boolean hasNext()
        {
            return current != null;
        }

        @Override
        public E next()
        {
            E data = current.getData();
            current = current.getNext();
            return data;
        }

        @Override
        public void remove()
        {
            originList.remove(current.prev);
        }

    }


}
