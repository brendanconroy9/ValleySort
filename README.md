ValleySort problem solution. MICS Programming competition 2024

Problem description:

Professor Plum likes to bicycle in the Rocky Mountains during his summer vacation. He typically gets dropped off at the top of the valley below. While writing an array question for his final examination in CS 101, he invents the notion of valley sort where the first half of the array is in descending order and last half of the array is in ascending order. More specifically, the largest item is in the first index, the second largest item is in the last index, the third largest item is in the second index, etc...

For example, an array initially ordered as: 20, 45, 30, 5, 15, 50, 10, 35 would be valley sorted as:
50, 35, 20, 10, 5, 15, 30, 45

Input format: 

The first line of the input file contains an integer count of the number of items to valley sort. The remaining lines will contain one integer per line. The below sample input contains 8 items to valley sort.

8
20
45
30
5
15
50
10
35

Output Format:

The first line of the output file should contain an integer count of the number of items valley sorted. The remaining lines will contain one integer per line in valley-sorted order. Output for the above input example is shown below:

8
50
35
20
10
5
15
30
45



