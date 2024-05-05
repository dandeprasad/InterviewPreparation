package Leetcode;

public class Add2Numbers {

  public static void main(String [] args){
      Add2Numbers addTwoNumbers = new Add2Numbers();
//243
//564



     // addTwoNumbers.addTwoNumbers(new ListNode(2,new ListNode(4,new ListNode(3,null))),new ListNode(5,new ListNode(6,new ListNode(4,null))));

      addTwoNumbers.addTwoNumbers( new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,null))))))),
              new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,null)))));
  }
    public ListNode addTwoNumbers(ListNode l_, ListNode l_1) {
      ListNode l1 = l_; ListNode l2=l_1;
        ListNode listNode_ = null;
        int passValue = 0;
        do {
            int sum = l1.val+l2.val+passValue;
            passValue = 0;
            if(sum>=10){
                passValue = 1;
                if(listNode_==null){
                    listNode_ = new  ListNode(sum%10, null);
                }
                else{
                    ListNode temp = listNode_;
                    while(temp.next!=null){
                        temp = temp.next;
                    }
                    temp.next = new  ListNode(sum%10, null);

                }

            }else{

                if(listNode_==null){
                    listNode_ = new  ListNode(sum, null);
                }
                else{


                    ListNode temp = listNode_;
                    while(temp.next!=null){
                        temp = temp.next;
                    }
                    temp.next = new  ListNode(sum, null);
                }
            }

           l1 =  l1.next;
            l2 = l2.next;
        } while(l1!=null && l2!=null);

        while(l1!=null){
            ListNode temp = listNode_;
            while(temp.next!=null){
                temp = temp.next;
            }
           int sum1 =  l1.val+passValue;
            if(sum1>=10) {
                passValue =1;
                temp.next = new ListNode(sum1%10, null);
            }else{
                passValue =0;
                temp.next = new ListNode(sum1, null);
            }
            l1 = l1.next;
        }
        while(l2!=null){
            ListNode temp = listNode_;
            while(temp.next!=null){
                temp = temp.next;
            }

            int sum2 =  l2.val+passValue;
            if(sum2>=10) {
                passValue =1;
                temp.next = new ListNode(sum2%10, null);
            }else{
                passValue =0;
                temp.next = new ListNode(sum2, null);
            }


            l2 = l2.next;
        }
        if(passValue==1){
            ListNode temp = listNode_;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = new ListNode(1, null);
        }
        return listNode_;
    }
}