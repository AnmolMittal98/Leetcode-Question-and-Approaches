/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        if(root==null){
            return new ArrayList<List<Integer>>();
        }
        List<List<Integer>> ll = new ArrayList<List<Integer>>();
        
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        
        while(que.size()>0){
            
            int sectionCount= que.size();
            List<Integer> section = new ArrayList<>();
            for(int i=0;i<sectionCount;i++){
                Node rem = que.remove();
                section.add(rem.val);
                for(int j=0;j<rem.children.size();j++){
                    que.add(rem.children.get(j));
                }
            }
            ll.add(section);
        }
        return ll;
    }
}