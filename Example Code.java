// class Customer {
//     private Order session;
//     private Restaurant res;
//     private Bank account;

//     public void ordering() {
//         session = new Order(); // you can initialise in constructor
//         res = new Restaurant();
//         account = new Bank();
//         session.add_food_items();
//         session.initiate_order();
//         status = session.pay_to_place_order();
//     }
// }

// class Order {
//     private Customer client = new Customer();
//     private Restaurant res = new Restaurant();
//     private Bank account = new Bank();

//     public void add_food_item(){
//     }
//     public void initiate_order() {
//         accepted = res.send_order();
//     }
//     public int pay_to_place_order() {
//         status = account.process_payment()
//         res.prepare_order();
//         return status;
//     }
//     class Restaurant{
//         private Order session;
//         public int send_order(){
//         return 1;
//     }
//     public void initiate_order() {
//         res = new Restaurant(); //you can initailise in constructors
//         accepted = res.send_order();
//     }
//     public void prepare_order() {
//     }
//     }
// }

// class Bank {
//     private Customer client = new Customer();
//     public int process_payment(){
//     return 1;
//     }
// }