import heapq

class node:
	def __init__(self,freq,symbol,left=None,right=None):
		self.freq=freq
		self.symbol=symbol
		self.left=left
		self.right=right
		self.huff=''

	def __lt__(self,next):
		return self.freq < next.freq

def printNodes(node,val=''):
	newVal= val+ str(node.huff)
	if(node.left):
		printNodes(node.left,newVal)
	if(node.right):
		printNodes(node.right,newVal)
	if(not node.right and not node.left):
		print(f"{node.symbol} -> {newVal}")
# chars=[]
# freq=[]
# for i in range(3):
#     char = input("Enter the characters: ")
#     fr = int(input("Enter the frequency: ")) 
#     chars.append(char)  
#     freq.append(fr)
# print("Characters:", chars)
# print("Frequencies:", freq)	     
Nodes=[]

chars=['a','b','c','d','e','f']
freq=[5,9,12,13,16,45]

for x in range(len(chars)):
	heapq.heappush(Nodes,node(freq[x],chars[x]))

while len(Nodes)>1:
	left=heapq.heappop(Nodes)
	right=heapq.heappop(Nodes)
	left.huff=0
	right.huff=1
	newNode=node(left.freq+right.freq,left.symbol+right.symbol,left,right)
	heapq.heappush(Nodes,newNode)
printNodes(Nodes[0])


