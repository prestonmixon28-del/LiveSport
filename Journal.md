# Journal
Phase-1:
Keeping them separate makes the code easier to understand and changed. The gameticker can focus on storing updates while the notifications are separate. This would make it easier to reuse and maintain.
Phase-2:
The interface create a common set of rules. The subject can notify any Observer without needing to know which specific class it is. It would make the program easier to change and add new observers.
Phase-3:
The GameTicker only needs to know that each object is an Observer. It can notify all of them, without knowing what type they are. This makes the program easier to read.