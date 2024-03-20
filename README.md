# Restaurant-Management-Application
Created Restaurant Management Application using SpringBoot and backend is written by java

## Design a Restaurant Management System
Expectations
<br>
Requirements gathering
<br>
Requirements
<br>
Use case diagrams
<br>

Restaurants (including bars, food trucks, and other foodservice businesses) have unique needs that a conventional POS system may not meet. For example, a typical feature is an ingredient-level inventory that lets you track items that make up your menu down to the last clove of garlic. This solves one of the main pain points in running a restaurant: how to do inventory. That’s something you won’t find in a retail POS, which usually count inventory stocks by-product and not what comprises it. A restaurant management system may also run on your tablet, so waiting staff can take orders and alert the kitchen and counter even before leaving the table.
<br>
### Restaurant Management System

A Restaurant Management System is a software built to handle all restaurant activities in an easy and safe manner. This System will give the Restaurant management power and flexibility to manage the entire system from a single portal. The system allows the manager to keep track of available tables in the system as well as the reservation of tables and bill generation.
<br>
#### Expectations
Code should be functionally correct.
Code should be modular and readable. Clean and professional level code.
Code should be extensible and scalable. Means it should be able to accommodate new requirements with minimal changes.
Code should have good OOP design principles.
Requirements gathering
What are some questions you would ask to gather requirements?

#### Requirements
What will be 10 requirements of the system, according to you? Do not worry about the correctness of the requirements, just write down whatever comes to your mind. Your job is not to generate the requirements, but get better at understanding problem statements and anticipating the functionalities your application might need.
<Details>
  <Summary>Click to see the actual requirements</Summary>
  <br>
  1. The restaurant will have different branches.
  <br>
  2. Each restaurant branch will have a menu.
  <br>
  3. The menu will have different menu sections, containing different menu items.
  <br>
  4. The waiter should be able to create an order for a table and add meals for each seat.
  <br>
  5. Each meal can have multiple meal items. Each meal item corresponds to a menu item.
  <br>
  6. The system should be able to retrieve information about tables currently available to seat walk-in customers.
  <br>
  7. The system should support the reservation of tables.
  <br>
  8. The receptionist should be able to search for available tables by date/time and reserve a table.
  <br>
  9. The system should allow customers to cancel their reservation.
  <br>
  10. The system should be able to send notifications whenever the reservation time is approaching.
  <br>
  11. The customers should be able to pay their bills through credit card, check or cash.
  <br>
  12. Each restaurant branch can have multiple seating arrangements of tables.
  <br>
</Details>


#### what we learn new here?
 3. The menu will have different menu sections, containing different menu items.
    <br>
    we are going to implement this using decorater design pattern, For want to learn more [click here](https://refactoring.guru/design-patterns/decorator)
    <br>
    Implemented in this code [click here](https://github.com/palanivel-raju/Restaurant-Management-Application/tree/master/src/main/java/com/projects/restaurantdesign/Decorater)

