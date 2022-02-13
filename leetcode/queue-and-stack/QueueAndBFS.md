# Queue and BFS

Breadth-first search (BFS) is an algorithm to traverse or search in data structures like a tree or a graph.

As we mentioned, we can use BFS to do level-order traversal in a tree.

We can also use BFS to traverse a graph. 
For example, we can use BFS to find a path, espectially the shortest path, from a start node to a target node.

We can use BFS, in even more abstract scenarios, to traverse all the possible statuses.
In this case, we can regard the statuses as the nodes in the graph while the legal transition paths as the edges in the graph.

In this chapter, we will briefly review how BFS works and focus more on how a queue helps us implement the BFS algorithm.
We will also provide some exercise for you to design and implement BFS by yourself.

## BFS - Template

Previously, we have already introduced two main scenarios of using BFS: do traversal or find the shortest path. Typically, it happens in a tree or a graph.
As we mentioned in the chapter description, BFS can also be used in more abstract scenarios.

In this article, we will provide you with a template. Them, we provide some exercise after this article for practice.

> It will be important to determine the nodes and the edges before doing BFS in a specific question.  
> Typically, the node will be an actual node or a status while the edge will be an actual edge or a possible transition.

### Template 1
    /**
     * Return the length of the shortest path between root and target node.
     * /
    int BFS(Node root, Node target) {
        Queue<Node> queue;  // store all nodes which are waiting to be processed
        int step = 0;       // number of steps neeeded from root to current node
        // initialize
        add root to queue;
        // BFS
        while (queue is not empty) {
            step = step + 1;
            // iterate the nodes which are already in the queue
            int size = queue.size();
            for (int i = 0; i < size; ++i) {
                Node cur = the first node in queue;
                return step if cur is target;
                for (Node next : the neighbors of cur) {
                    add next to queue;
                }
                remove the first node from queue;
            }
        }
        return -1;          // there is no path from root to target
    }
1. As shown in the code, in each round, the nodes in the queue are the nodes which are waiting to be processed.
2. After each outer while loop, we are one step farther from the root node. The variable step indicates the distance from the root node and the current note we are visiting.

### Template 2

Sometimes, it is important to make sure that we never visit a node twice. Otherwise, we might get stuck in an infinite loop, e.g. in graph with cycle.
If so, we can add a hash set to the code above to solve this problem. Here is the pseudocode after modification:

    /**
     * Return the length of the shortest path between root and target node.
     */
    int BFS(Node root, Node target) {
        Queue<Node> queue;  // store all nodes which are waiting to be processed
        Set<Node> visited;  // store all the nodes that we've visited
        int step = 0;       // number of steps neeeded from root to current node
        // initialize
        add root to queue;
        add root to visited;
        // BFS
        while (queue is not empty) {
            step = step + 1;
            // iterate the nodes which are already in the queue
            int size = queue.size();
            for (int i = 0; i < size; ++i) {
                Node cur = the first node in queue;
                return step if cur is target;
                for (Node next : the neighbors of cur) {
                    if (next is not in used) {
                    add next to queue;
                    add next to visited;
                }
            }
            remove the first node from queue;
            }
        }
        return -1;          // there is no path from root to target
    }

>There are some cases where one does not need keep the visited hash set:  
>1. You are absolutely sure there is no cycle, for example, in tree traversal;
>2. You do want to add the node to the queue multiple times.


## Number of islands

Given an m x n 2D binary grid which represents a map of '1's (land) and '0's (water), return the number of islands.

An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. 
You may assume all four edges of the grid are all surrounded by water.

#### Example 1:
    Input: grid = [
        ["1","1","1","1","0"],
        ["1","1","0","1","0"],
        ["1","1","0","0","0"],
        ["0","0","0","0","0"]
    ]
    Output: 1

#### Example 2:
    Input: grid = [
        ["1","1","0","0","0"],
        ["1","1","0","0","0"],
        ["0","0","1","0","0"],
        ["0","0","0","1","1"]
    ]
    Output: 3

#### Constraints
- m == grid.length
- n == grid[i].length
- 1 <= m, n <= 300
- grid[i][j] is '0' or '1'.


    class Solution {
        public int numIslands(char[][] grid) {
            
            int count = 0;
            for(int i=0; i<grid.length; i++) {
                for(int j=0; j<grid[i].length; j++) {
                    if(grid[i][j] == '1') {
                        count += 1;
                        callBFS(grid, i, j);
                    }
                }
            }
            return count;
        }

        public void callBFS(char[][] grid, int i, int j) {
            if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j] == '0') {
                return;
            }
            grid[i][j] = '0';
            callBFS(grid, i+1, j);    //up
            callBFS(grid, i-1, j);    //down
            callBFS(grid, i, j-1);    //left
            callBFS(grid, i, j+1);    //right
        }
    }
    
## Open the Lock

You have a lock in front of you with 4 circular wheels. Each wheel has 10 slots: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'. 
The wheels can rotate freely and wrap around: for example we can turn '9' to be '0', or '0' to be '9'. Each move consists of turning one wheel one slot.

The lock initially starts at '0000', a string representing the state of the 4 wheels.

You are given a list of deadends dead ends, meaning if the lock displays any of these codes, 
the wheels of the lock will stop turning and you will be unable to open it.

Given a target representing the value of the wheels that will unlock the lock, 
return the minimum total number of turns required to open the lock, or -1 if it is impossible.

#### Example 1:

    Input: deadends = ["0201","0101","0102","1212","2002"], target = "0202"
    Output: 6
    Explanation:
    A sequence of valid moves would be "0000" -> "1000" -> "1100" -> "1200" -> "1201" -> "1202" -> "0202".
    Note that a sequence like "0000" -> "0001" -> "0002" -> "0102" -> "0202" would be invalid,
    because the wheels of the lock become stuck after the display becomes the dead end "0102".

#### Example 2:

    Input: deadends = ["8888"], target = "0009"
    Output: 1
    Explanation:
    We can turn the last wheel in reverse to move from "0000" -> "0009".

#### Example 3:

    Input: deadends = ["8887","8889","8878","8898","8788","8988","7888","9888"], target = "8888"
    Output: -1
    Explanation:
    We can't reach the target without getting stuck.

#### Example 4:

    Input: deadends = ["0000"], target = "8888"
    Output: -1

#### Constraints:

- 1 <= deadends.length <= 500
- deadends[i].length == 4
- target.length == 4
- target will not be in the list deadends.
- target and deadends[i] consist of digits only. 
