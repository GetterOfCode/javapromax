package com.itheima.run;

import com.itheima.bean.Business;
import com.itheima.bean.Movie;
import com.itheima.bean.User;
import com.itheima.bean.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class MovieSystem {
    /**
     *
     * 定义系统的数据容器用户存储数据
     * 1.储存很多用户（客户对象，商家对象）
     *
     */
    public static final List<User> ALL_USERS = new ArrayList<>();

    /**
     2.存储系统全部商家和其排片信息
        商家=【1，2】
     */
    public static final Map<Business, List<Movie>> ALL_MOVIES = new HashMap<>();
    public static final Scanner SYS_SC = new Scanner(System.in);
    //定义一个静态User类型的变量记住当前登陆成功的用户对象
    public static User loginUser;
    public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    public static final Logger LOGGER= LoggerFactory.getLogger("MovieSystem.class") ;

    /**
     3.准备一些测试数据
     */
    static {
        Customer c = new Customer();
        c.setLoginName("zyf888");
        c.setPassWord("123456");
        c.setUserName("黑马刘德华");
        c.setSex('男');
        c.setMoney(10000);
        c.setPhone("110110");
        ALL_USERS.add(c);

        Customer c1 = new Customer();
        c1.setLoginName("gzl888");
        c1.setPassWord("123456");
        c1.setUserName("黑马关之琳");
        c1.setSex('女');
        c1.setMoney(2000);
        c1.setPhone("111111");
        ALL_USERS.add(c1);

        Business b = new Business();
        b.setLoginName("baozugong888");
        b.setPassWord("123456");
        b.setUserName("黑马包租公");
        b.setMoney(0);
        b.setSex('男');
        b.setPhone("110110");
        b.setAddress("火星6号2B二层");
        b.setShopName("甜甜圈国际影城");
        ALL_USERS.add(b);
        // 注意，商家一定需要加入到店铺排片信息中去
        List<Movie> movies = new ArrayList<>();
        ALL_MOVIES.put(b , movies); // b = []

        Business b2 = new Business();
        b2.setLoginName("baozupo888");
        b2.setPassWord("123456");
        b2.setUserName("黑马包租婆");
        b2.setMoney(0);
        b2.setSex('女');
        b2.setPhone("110110");
        b2.setAddress("火星8号8B八层");
        b2.setShopName("巧克力国际影城");
        ALL_USERS.add(b2);
        // 注意，商家一定需要加入到店铺排片信息中去
        List<Movie> movies3 = new ArrayList<>();
        ALL_MOVIES.put(b2 , movies3); // b2 = []
    }


    public static void main(String[] args) {
        showMain();


    }

    public static void showMain(){

        while (true) {
            System.out.println("=============黑马电影首页===========");
            System.out.println("1.登录");
            System.out.println("2.用户注册");
            System.out.println("3.商家注册");
            System.out.println("请输入操作命令:");

            String command = SYS_SC.nextLine();
            switch (command){
                case "1":
                    //登录
                    login();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                default:
                    System.out.println("命令有误，请确认！");

                }
        }

    }

    private static void login() {
        System.out.println("请输入登录名称：");
        String loginName = SYS_SC.nextLine();
        System.out.println("请输入登录密码：");
        String passWord = SYS_SC.nextLine();


        //根据登录名查询用户对象
        User u = gerUserByLoginName(loginName);
        //判断用户对象是个否存在，存在说明登录名称正确了
        if (u != null) {
            //比对密码是否正确
            if(u.getPassWord().equals(passWord)){
                //登陆成功
                loginUser = u;
                LOGGER.info(u.getUserName()+"登录了系统！");
                if (u instanceof Customer){
                    //普通用户
                    showCustomerMain();
                }else{
                    //商家用户
                    showBusinessMain();
                }
                return;
            }else{
                System.out.println("密码错误！");
            }
        }else {
            System.out.println("登录名称错误，请确认！");
        }

    }

    /**
     * 商家后台操作界面
     */
    private static void showBusinessMain() {
        while (true) {
            System.out.println("============黑马电影商家界面===================");
            System.out.println(loginUser.getUserName() + (loginUser.getSex()=='男'? "先生":"女士" + "欢迎您进入系统"));
            System.out.println("1、展示详情:");
            System.out.println("2、上架电影:");
            System.out.println("3、下架电影:");
            System.out.println("4、修改电影:");
            System.out.println("5、退出:");

            System.out.println("请输入您要操作的命令：");
            String command = SYS_SC.nextLine();
            switch (command){
                case "1":
                    // 展示全部排片信息
                    showBusinessInfos();
                    break;
                case "2":
                    // 上架电影信息
                    addMovie();
                    break;
                case "3":
                    // 下架电影信息
                    deleteMovie();
                    break;
                case "4":
                    // 修改电影信息
                    updateMovie();
                    break;
                case "5":
                    System.out.println(loginUser.getUserName() +"请您下次再来啊~~~");
                    return; // 干掉方法
                default:
                    System.out.println("不存在该命令！！");
                    break;
            }
        }

    }

    /**
     * 影片修改功能
     */
    private static void updateMovie() {
        System.out.println("=============修改电影============");
        Business business = (Business)loginUser;
        List<Movie> movies = ALL_MOVIES.get(business);
        if(movies.size()==0){
            System.out.println("当前无片可修改！");
            return;
        }
        while (true) {
            System.out.println("请您输入要修改的电影名称：");
            String movieName  = SYS_SC.nextLine();

            //查询有没有这个影片对象
            Movie movie = getMovieByName(movieName);
            if (movie != null) {
                //修改
                System.out.println("请您输入新片名：");
                String name  = SYS_SC.nextLine();
                System.out.println("请您输入主演：");
                String actor  = SYS_SC.nextLine();
                System.out.println("请您输入时长：");
                String time  = SYS_SC.nextLine();
                System.out.println("请您输入票价：");
                String price  = SYS_SC.nextLine();
                System.out.println("请您输入票数：");
                String totalNumber  = SYS_SC.nextLine(); // 200\n
                while (true) {
                    try {
                        System.out.println("请您输入影片放映时间：");
                        String stime  = SYS_SC.nextLine();
                        movie.setName(name);
                        movie.setActor(actor);
                        movie.setPrice(Double.valueOf(price));
                        movie.setTime(Double.valueOf(time));
                        movie.setNumber(Integer.valueOf(totalNumber));
                        movie.setStartTime(sdf.parse(stime));
                        System.out.println("修改影片成功！");
                        showBusinessInfos();

                        return; // 直接退出去
                    } catch (ParseException e) {
                        e.printStackTrace();
                        LOGGER.error("时间解析出了毛病");
                    }
                }


            }else {
                System.out.println("您的店铺没有上架该影片！");
                System.out.println("请问继续嘛？y/n");
                String command = SYS_SC.nextLine();
                switch (command){
                    case "y":
                        break;
                    default:
                        System.out.println("好的！");
                        return;
                }
            }
        }

    }


    /**
     * 影片下架功能
     */
    private static void deleteMovie() {
        System.out.println("==============下架电影=============");
        Business business = (Business)loginUser;
        List<Movie> movies = ALL_MOVIES.get(business);
        if(movies.size()==0){
            System.out.println("当前无片可以下架！");
            return;

        }
        //用户选择要下架的电影名称
        while (true) {
            System.out.println("请您输入要下架的电影名称：");
            String movieName  = SYS_SC.nextLine();

            //查询有没有这个影片对象
            Movie movie = getMovieByName(movieName);
            if (movie != null) {
                //下架
                movies.remove(movie);
                System.out.println("您当前店铺已经成功下架了:" + movie.getName());
                showBusinessInfos();
                return;
            }else {
                System.out.println("您的店铺没有上架该影片！");
                System.out.println("请问继续嘛？");
                String command = SYS_SC.nextLine();
                switch (command){
                    case "y":
                        break;
                    default:
                        System.out.println("好的！");
                        return;
                }
            }
        }


    }

    /**
     * 去查询当前商家下的排片
     * @param movieName 电影名
     * @return
     */
    public static  Movie getMovieByName(String movieName){
        Business business = (Business)loginUser;
        List<Movie> movies = ALL_MOVIES.get(business);
        for (Movie movie : movies) {
            if(movie.getName().contains(movieName)){
                return movie;
            }
        }
        return null;

    }

    /**
     * 商家进行电影上架
     */
    private static void addMovie() {
        Business business = (Business)loginUser;
        List<Movie> movies = ALL_MOVIES.get(business);
        System.out.println("请您输入新片名：");
        String name  = SYS_SC.nextLine();
        System.out.println("请您输入主演：");
        String actor  = SYS_SC.nextLine();
        System.out.println("请您输入时长：");
        String time  = SYS_SC.nextLine();
        System.out.println("请您输入票价：");
        String price  = SYS_SC.nextLine();
        System.out.println("请您输入票数：");
        String totalNumber  = SYS_SC.nextLine(); // 200\n
        while (true) {
            try {
                System.out.println("请您输入影片放映时间：");
                String stime  = SYS_SC.nextLine();
                // public Movie(String name, String actor, double time, double price, int number, Date startTime)        // 封装成电影对象 ，加入集合movices中去
                Movie movie = new Movie(name, actor ,Double.valueOf(time) , Double.valueOf(price)
                        , Integer.valueOf(totalNumber) ,  sdf.parse(stime));
                movies.add(movie);
                System.out.println("您已经成功上架了：《" + movie.getName() + "》");
                return; // 直接退出去
            } catch (ParseException e) {
                e.printStackTrace();
                LOGGER.error("时间解析出了毛病");
            }
        }

    }

    /**
     * 展示商家的详细信息：展示当前商家的详细信息。
     */
    private static void showBusinessInfos() {
        System.out.println("===============商家详情界面=================");
        LOGGER.info(loginUser.getUserName()+"商家,正在查看自己的详情！");
        //根据商家对象，作为map集合的键，提取对应值及其排片信息：map<Business,list<Movie>> ALL_MOVIES
        Business business  = (Business) loginUser;
        System.out.println(business.getShopName()+"\t\t"+business.getPhone()+"\t\t"+business.getAddress());
        List<Movie> movies = ALL_MOVIES.get(loginUser);
        if (movies.size() > 0) {
            System.out.println("片名\t\t\t主演\t\t时长\t\t评分\t\t票价\t\t余票数量\t\t放映时间");
            for (Movie movie : movies) {
                System.out.println(movie.getName()+"\t\t\t"+movie.getActor()+"\t\t"+movie.getTime()
                        +"\t\t"+movie.getScore()+"\t\t"+movie.getPrice()+"\t\t"+movie.getPrice()+"\t\t"+movie.getNumber()
                        +"\t\t"+sdf.format(movie.getStartTime()));
            }
        }else{
            System.out.println("您的店铺当前无片可播！");
        }

    }

    /**
     * 客户操作界面
     */
    private static void showCustomerMain() {
        while (true) {
            System.out.println("============黑马电影客户界面===================");
            System.out.println(loginUser.getUserName() + (loginUser.getSex()=='男'? "先生":"女士" + "欢迎您进入系统" +
                    "\t余额：" + loginUser.getMoney()));
            System.out.println("请您选择要操作的功能：");
            System.out.println("1、展示全部影片信息功能:");
            System.out.println("2、根据电影名称查询电影信息:");
            System.out.println("3、评分功能:");
            System.out.println("4、购票功能:");
            System.out.println("5、退出系统:");
            System.out.println("请输入您要操作的命令：");
            String command = SYS_SC.nextLine();
            switch (command){
                case "1":
                    // 展示全部排片信息
                    showAllMovies();
                    break;
                case "2":
                    break;
                case "3":
                    // 评分功能
                    scoreMovie();

                    showAllMovies();
                    break;
                case "4":
                    // 购票功能
                    buyMovie();
                    break;
                case "5":
                    return; // 干掉方法
                default:
                    System.out.println("不存在该命令！！");
                    break;
            }
        }
    }

    /**
     *用户购票功能
     */
    private static void buyMovie() {
        showAllMovies();
        System.out.println("===============用户购票功能===================");
        while (true) {
            System.out.println("请您输入需要买票的门店：");
            String shopName = SYS_SC.nextLine();
            //查询是否存在该商家
            Business business = getBusinessByShopName(shopName);
            if(business == null){
                System.out.println("对不起，没有该店铺！请确认");
            } else{
              //此商家的全部排片
              List<Movie> movies = ALL_MOVIES.get(business);
                if (movies.size() > 0) {
                    //开始选片购买
                    while (true) {
                        System.out.println("请输入电影名称：");
                        String movieName = SYS_SC.nextLine();
                        Movie movie = getMovieByShopName(business, movieName);
                        if(movie!=null){
                            //开始购买
                            while (true) {
                                System.out.println("请输入需要购买的电影票数：");
                                String number = SYS_SC.nextLine();
                                int buyNumber = Integer.valueOf(number);
                                //判断电影票数是否足够
                                if (movie.getNumber()>=buyNumber) {
                                    //可以购买了

                                }else {
                                    //票数不够
                                    System.out.println("您当前最多可购买" + movie.getNumber() + "张票！");
                                    System.out.println("是否继续买票？y/n");
                                    String command = SYS_SC.nextLine();
                                    switch (command){
                                        case "y":
                                            break;
                                        default:
                                            System.out.println("好的！");
                                            return;
                                    }

                                }
                            }
                        }else{
                            System.out.println("电影名称有问题！");
                        }
                    }

                }else {
                    System.out.println("电影院关门了");
                    System.out.println("是否继续买票？y/n");
                    String command = SYS_SC.nextLine();
                    switch (command){
                        case "y":
                            break;
                        default:
                            System.out.println("好的！");
                            return;
                    }
                }
            }
        }

    }

    private static Movie getMovieByShopName(Business business,String movieName) {
        List<Movie> movies = ALL_MOVIES.get(business);
        for (Movie movie : movies) {
            if(movie.getName().contains(movieName)){
                return movie;
            }
        }
        return null;

    }

    /**
     * 根据商家店铺名称查询商家对象
     * @return
     */
    public static Business getBusinessByShopName(String shopName){
        Set<Business> businesses = ALL_MOVIES.keySet();
        for (Business business : businesses) {
            if(business.getShopName().equals(shopName)){
                return business;
            }
        }
        return null;


    }

    /**
     *
     */

    private static void scoreMovie() {
    }

    /**
     *展示电影和商家信息
     */
    private static void showAllMovies() {
        System.out.println("===============展示全部商家======================");
        ALL_MOVIES.forEach(((business, movies) ->{
            System.out.println(business.getShopName()+"\t\t"+business.getPhone()+"\t\t"+business.getAddress());

            System.out.println("片名\t\t\t主演\t\t时长\t\t评分\t\t票价\t\t余票数量\t\t放映时间");
            for (Movie movie : movies) {
                System.out.println(movie.getName() + "\t\t\t" + movie.getActor() + "\t\t" + movie.getTime()
                        + "\t\t" + movie.getScore() + "\t\t" + movie.getPrice() + "\t\t" + movie.getPrice() + "\t\t" + movie.getNumber()
                        + "\t\t" + sdf.format(movie.getStartTime()));
            }
        }));
    }

    public static User gerUserByLoginName(String loginName){
        for (User user: ALL_USERS){
            if(user.getLoginName().equals(loginName)){
                return user;
            }
        }
        return null;

    }

}
