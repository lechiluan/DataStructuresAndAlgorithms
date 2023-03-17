# Linked List implementation in Python
class Node:
    # Function to initialize the node object
    def __init__(self, item):
        self.item = item  # Assign data
        self.next = None  # Initialize next as null
class LinkedList:
    def __init__(self):
        self.head = None
        
if __name__=='__main__':
    # Code execution starts here
    linked_list = LinkedList()
    # Assign item values
    linked_list.head = Node(1)
    second = Node(2)
    third = Node(3)
    # Connect nodes
    linked_list.head.next = second
    second.next = third
    # Print the linked list item
    while linked_list.head != None:
        print(linked_list.head.item, end=" ")
        linked_list.head = linked_list.head.next