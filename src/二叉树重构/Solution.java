package �������ع�;

/**
 * @author Administrator
 *
 */
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
         TreeNode root=new TreeNode(pre[0]);//ǰ��ĵ�һ������Ϊ��
	int len=pre.length;
	//��ֻ��һ������ʱ��
	if(len==1){
        root.left=null;
        root.right=null;
		return root;
	}
	//�ҵ������еĸ�λ��
	int rootval=root.val;
	int i;
	for(i=0;i<len;i++){
		if(rootval==in[i])
			break;
	}
	//����������
	if(i>0){
		int[] pr=new int[i];
		int[] ino=new int[i];
		for(int j=0;j<i;j++){
			pr[j]=pre[j+1];
		}
		for(int j=0;j<i;j++){
			ino[j]=in[j];
		}
		root.left=reConstructBinaryTree(pr,ino);
	}else{
		root.left=null;
	}
	//����������
	if(len-i-1>0){
		int[] pr=new int[len-i-1];
		int[] ino=new int[len-i-1];
		for(int j=i+1;j<len;j++){
			ino[j-i-1]=in[j];
			pr[j-i-1]=pre[j];
		}
		root.right=reConstructBinaryTree(pr,ino);
	}else{
		root.right=null;
	}
	
	
    return root;
    }
}