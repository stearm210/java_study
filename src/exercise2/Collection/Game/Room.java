package exercise2.Collection.Game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Room {
        //必须有牌
        private List<Card> allCards=new ArrayList<>();//牌的list数组进行存牌
        public Room(){
            //1.做出54张牌，将这些牌放在集合allCards中
        //2.点数：个数确定了，类型进行确定
        String[] numbers={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};//点数数组

        //3.定义花色数组
        String[] colors={"x","y","z","l"};

        int size=0;//表示每张牌的大小,54张牌最大了

        //4.遍历点数之后再遍历花色，组织牌
        for(String number:numbers){
            size++;
            for(String color:colors){
                //得到一张牌
                Card c=new Card(number,color,size);//对一张牌进行封装
                allCards.add(c);//存牌
            }
        }
        //单独存放大小王信息
        Card c1=new Card("","a",++size);
        Card c2=new Card("","b",++size);
            Collections.addAll(allCards,c1,c2);//批量添加数据
            System.out.println("新牌"+allCards);
        }

        /*
        * 游戏启动操作
        * */
    public void start() {
        //1.洗牌
        Collections.shuffle(allCards);//打乱对应顺序
        System.out.println("洗牌后"+allCards);

        //2.发牌，定义三个玩家。List(ArrayList进行操作)
        List<Card> human1=new ArrayList<>();
        List<Card> human2=new ArrayList<>();
        List<Card> human3=new ArrayList<>();

        //正式发牌给玩家，先发51张牌，剩下三张牌用于地主
        //每三次发牌为一轮，因此需要对3求余来判断下一轮发牌

        for(int i=0;i<allCards.size()-3;i++){
        Card c=allCards.get(i);
        if(i%3==0){
            human1.add(c);
        } else if (i%3==1) {
            human2.add(c);
        } else if (i%3==2) {
            human3.add(c);
        }
    }
        //对牌进行排序
        sortCards(human1);
        sortCards(human2);
        sortCards(human3);
        
        
        //输出
        System.out.println("1"+human1);
        System.out.println("2"+human2);
        System.out.println("3"+human3);

        //地主3张牌获取
        //将原数组中的牌进行截断，从51开始直到54一共三张牌
        //截断后的牌会放回到一个list数组中保存
        List<Card> lastThreeCards=allCards.subList(allCards.size()-3,allCards.size());
        System.out.println("底牌"+lastThreeCards);
        //
        //这里表示human1抢到这3张底牌
        human1.addAll(lastThreeCards);
        sortCards(human1);//抢到地主之后再次排序
        System.out.println("human1抢到底牌"+human1);
    }

    //集中进行排序
    //使用比较器对象进行排序
    private void sortCards(List<Card> cards) {
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1,Card o2){
                return o1.getSize()-o2.getSize();//升序排序
            }
        });
    }

}

