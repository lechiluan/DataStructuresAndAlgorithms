# Queue implementation in Python

class Queue:
    def __init__(self):
        self.queue  = []
    # Add a element
    def enqueue(self, item):    
        self.queue.append(item)
    # Remove a element    
    def dequeue(self):
        if len(self.queue) == 0:
            return "Queue is empty"
        self.queue.pop(0)
    
    # Display the queue
    def display(self):
        print(self.queue)
        
    # Size of queue
    def size(self):
        return len(self.queue)

queue = Queue()

queue.enqueue(1)
queue.enqueue(2)
queue.enqueue(3)
queue.enqueue(4)
queue.enqueue(5)

queue.display()

queue.dequeue()

print("After removing an element: ")

queue.display()