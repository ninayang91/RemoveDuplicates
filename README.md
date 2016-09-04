# RemoveDuplicates
Remove duplicates in an unsorted linked list

//use Hashtable to store each value,

//we use n.next.data to compare since we may need to remove it, n.next=n.next.next

//if buffer is not allowed, we could only scan the left nodes, runner=n, we check runner.next.data in case we need to remove it
