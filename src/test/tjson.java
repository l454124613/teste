package test;


import tools.Text;

import java.io.IOException;

import java.util.*;

/**
 * Created by lixuecheng on 2016/6/22.
 */
public class tjson {
    public static void main(String[] args) throws IOException {
        List<String> a=Text.from("data/json.txt");
        StringBuffer s=new StringBuffer();
        for (String c:a
             ) {
        s.append(c);
        }
        String  w=s.toString().replace(" ","").replace("\t","").replace("：",":").replace("，",",").replace("[","{").replace("]","}");
        System.out.println(w);

        char[] ca= w.toCharArray();
        StringBuffer s1=new StringBuffer();
        int ceng=0;
        List<pageson> lp=new ArrayList<>();
        String c0="";
        String c="";
        String c2="";
        for (int i = 0; i < ca.length; i++) {
           if(ca[i]==':'){
               if (ceng==0){
                   lp.add(new pageson());
               }
               else  if(ceng==1){
                   if (s1.toString().equalsIgnoreCase("name")){
                   c0=s1.toString();

                   }
                   else    if (s1.toString().equalsIgnoreCase("element")){
                     //  lp.get(lp.size()-1).add(new eleson());
                       lp.get(lp.size()-1).setL(new ArrayList<eleson>());

                   }
               }
               else  if(ceng==2){
                     if(s1.toString().equalsIgnoreCase("button")||
                        s1.toString().equalsIgnoreCase("input")||
                        s1.toString().equalsIgnoreCase("chioce")||
                        s1.toString().equalsIgnoreCase("select")||
                        s1.toString().equalsIgnoreCase("upload")){
                    lp.get(lp.size()-1).add(new eleson());
                    lp.get(lp.size()-1).getL().get(lp.get(lp.size()-1).getL().size()-1).setOp(s1.toString());

                }


               } else   if(ceng==3){
                   if(s1.toString().equalsIgnoreCase("switch")){
                       lp.get(lp.size()-1).getL().get(lp.get(lp.size()-1).getL().size()-1).setSwitchto(new HashMap<String, String>());
                   }else {
                       c=s1.toString();
                   }

               }
               else if(ceng==4){
                   c2=s1.toString();

               }
               s1.setLength(0);
           }

            else if(ca[i]=='{'){
    ceng++;


}
           else   if (ca[i]==','){

if(ceng==0){


}
else if (ceng==1){
                    if(c0.equalsIgnoreCase("name")){
                        lp.get(lp.size()-1).setName(s1.toString());

                    }
                }
else      if (ceng==2){}
else      if(ceng==3){
                    if(c.equalsIgnoreCase("type")){
                        lp.get(lp.size()-1).getL().get(lp.get(lp.size()-1).getL().size()-1).setType(s1.toString());
                    }
                    if(c.equalsIgnoreCase("value")){
                        lp.get(lp.size()-1).getL().get(lp.get(lp.size()-1).getL().size()-1).setValue(s1.toString());
                    }
                    if(c.equalsIgnoreCase("name")){
                        lp.get(lp.size()-1).getL().get(lp.get(lp.size()-1).getL().size()-1).setName(s1.toString());
                    }
                }
else     if (ceng==4){

                    lp.get(lp.size()-1).getL().get(lp.get(lp.size()-1).getL().size()-1).getSwitchto().put(c2,s1.toString());
                }

                s1.setLength(0);
            }

           else    if(ca[i]=='}'){
                if (s1.toString().length()>0){
                    if(ceng==0){


                    }
                    else   if (ceng==1){
                        if(c0.equalsIgnoreCase("name")){
                            lp.get(lp.size()-1).setName(s1.toString());

                        }
                    }
                    else if (ceng==2){}
                    else  if(ceng==3){
                        if(c.equalsIgnoreCase("type")){
                            lp.get(lp.size()-1).getL().get(lp.get(lp.size()-1).getL().size()-1).setType(s1.toString());
                        }
                        else   if(c.equalsIgnoreCase("value")){
                            lp.get(lp.size()-1).getL().get(lp.get(lp.size()-1).getL().size()-1).setValue(s1.toString());
                        }
                        else  if(c.equalsIgnoreCase("name")){
                            lp.get(lp.size()-1).getL().get(lp.get(lp.size()-1).getL().size()-1).setName(s1.toString());
                        }
                    }
                    else if (ceng==4){
                        lp.get(lp.size()-1).getL().get(lp.get(lp.size()-1).getL().size()-1).getSwitchto().put(c2,s1.toString());
                    }

                    s1.setLength(0);
                    ceng--;
                }else {
                    ceng--;
                }
            }else{
               s1.append(ca[i]);
           }
        }
        System.out.println(lp);



     //   char[] ca= w.toCharArray();
    //    int a1=0;
     //   StringBuffer  back=new StringBuffer();
      //  System.out.println(Arrays.toString(w.split(",")));

//
//
//       char[] ca= w.toCharArray();
//        StringBuffer  back=new StringBuffer();
//        Map<String,Integer> m1=new HashMap();
//        Stack<String > stack = new Stack();
//        int ceng=0;
//        Map<String,String> m2=new HashMap();
//        Map<String,String> m3=new HashMap();
//        for (char cc:ca
//             ) {
//
//            if(cc==':'){
//            stack.push(back.toString());
//            back.setLength(0);
//            }
//            else if (cc=='{'){
//                m1.put(stack.peek(),ceng++);
//
//
//            }
//
//            else  if (cc==','){
//                m2.put(stack.peek(),back.toString());
//                back.setLength(0);
//            }
//            else   if(cc=='['){
//                m1.put(stack.peek(),ceng++);
//            }
//            else if(cc=='}'){
//                if(back.length()>0){
//                    m2.put(stack.peek(),back.toString());
//                    back.setLength(0);
//                    ceng--;
//                }else {
//                    ceng--;
//                }
//
//            }
//            else if(cc==']'){
//                if(back.length()>0){
//                    m2.put(stack.peek(),back.toString());
//                    back.setLength(0);
//                    ceng--;
//                }else {
//                    ceng--;
//                }
//            }
//            else  back.append(cc);
//
//
//
//        }
//        System.out.println(m2);
//        System.out.println(m1);
//        System.out.println(stack);


//        w=w.replace(":{","\n").replace("},","\n");
//        System.out.println(w);




    }
List<pageson> lp;
    eleson e;
    Object aa(String a){
         switch(a) {
             case "element" :return new pageson();
             case "button" :
             case "input":
             case "chioce" :
             case "select":
             case "upload":
                 return  new eleson();



        }

        return null;
    }
    void bb(String a,String b){
switch(a){
    case "type":e.setType(b);break;
    case "value":e.setValue(b);break;
    case "name":e.setName(b);break;
    case "switch": break;
}

    }

}
