package com;

 

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

 

public class OrderService {
    
    static HashMap<Integer, Order> orderIdMap = getOrderIdMap(); //map list

 

    public OrderService() {
        super();

   
 

         if (orderIdMap == null) {
        orderIdMap = new HashMap<Integer, Order>();
        
        // Creating some objects of Order while initializing
        Order mobileOrder = new Order(1,1001,128223,10000.2,"GSYSBW",402.34,1,"Jan2021","Dec2020" );
        Order laptopOrder = new Order(2,1002,142643,999,"HFYRFF",32.5,1,"Jan2021","March2020" );
        Order watchOrder = new Order(3,1003,134343,45045.67,"ICDHFE",602.76,1,"Jan2021","Nov2020" );
        Order shoeOrder = new Order(4,1004,232434,1000,"IEWEIF",32.6,1,"Jan2021","Dec2020" );

 

         //adding map list of collections in java
        orderIdMap.put(1, mobileOrder);
        orderIdMap.put(2, laptopOrder);
        orderIdMap.put(3, watchOrder);
        orderIdMap.put(4, shoeOrder);
        }
        }

 

         public List<Order> getAllOrderlist() {
        List<Order> orderlist = new ArrayList<Order>(orderIdMap.values());
        return orderlist;
        }

 

         public Order getOrder(int id) {
        Order Order = orderIdMap.get(id);
        return Order;
        }
        // add order
        public Order addOrder(Order Order) {
        Order.setId(getMaxId()+ 1);
        
        // key , value
        orderIdMap.put(Order.getId(), Order); ///logic class
        return Order;
        }
        //update
        public Order updateOrder(Order order) {
        if (order.getId() <= 0)
        return null;
        orderIdMap.put(order.getId(), order);
        return order;

 

         }
        
        //delete

 

        public void deleteOrder(int id) {
        orderIdMap.remove(id);
        }

 

         public static HashMap<Integer, Order> getOrderIdMap() {
        return orderIdMap;
        }

 

         // Utility method to get max id
        public static int getMaxId() {
        int max = 0;
        for (int id : orderIdMap.keySet()) {
        if (max <= id)
        max = id;

 

         }
        return max;
        }
        

 

}