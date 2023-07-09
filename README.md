# Java_Trading_Machine
I used Java.net and Java.io along with trading algorithm to make a system that connects with a stock exchange server, recieves data, executes trading strategy and places order on the server

# Imitation of a trading System 

In this project, I have tried to imitate a trading system which consists of 5 classes and each class performs a unique function. I have described my implementation of each of the following classes

## 1. NetworkingClass.java
The `NetworkingClass` class is responsible for establishing a connection to a server, sending a GET request to fetch stock price data from a specified endpoint, and returning the received data as a string. It utilizes the `HttpURLConnection` class and handles HTTP response codes to ensure successful retrieval of the data. Through this class, I aim to establish my connection with the Server through which I am aiming to get data in CSV format. 

## 2. DataFormatter.java
The `DataFormatter` class provides functionality for parsing raw data received from the server and formatting it into a list of integers. Specifically, it takes a string of comma-separated values (CSV) and converts it into a list of integers representing stock prices. This class is useful for further processing and manipulation of the stock price data.This class serves to convert the CSV to Integer list which I will use in my Trading Algorithm 

## 3. AlgorithmRunner.java
The `AlgorithmRunner` class represents a placeholder for running a hypothetical algorithm on the stock prices. This class can be customized to implement an algorithm of choice, perform calculations or analysis on the stock prices, and make decisions based on the results. It is intended to demonstrate the integration of an algorithm within the overall workflow. This class serves to trade the stock at lowest price in the list and sell it to next maximum price and aims to make a profit. I used this algorithm for simplicity, you can definitely modify it as per your requirements. 


## 4. StockExchangeCommunicator.java
The `StockExchangeCommunicator` class facilitates the execution of a trade by sending a POST request to a specified trade endpoint on the server. It constructs the request payload in JSON format, including the trade type ("BUY" or "SELL") and the price. It uses the `HttpURLConnection` class to establish the connection, set request headers, write the data payload, and handle the HTTP response code. After the Algorithm runs perfectly and generates signals, this class communicates with the Stock Exchange Server to execute trades accordingly

## 5. MainClass.java
The `MainClass` class serves as the entry point for the application. It demonstrates the complete workflow by utilizing the other classes to fetch stock prices, format the data, run an algorithm on the prices, and execute a trade based on the algorithm's result. It showcases the integration of the networking and data manipulation functionality.
For demonstration purpose, I have used "https://example.com/prices" to get prices and "https://example.com/trade" to execute trades. This has to be replaced with respective websites of the Stock Exchanges 

Feel free to explore and modify the code as needed. It serves as a starting point for networking operations, data manipulation, and interaction with a server for retrieving and processing stock price data.

Please note that this project assumes familiarity with Java programming, networking concepts, and JSON/CSV data formats. It is recommended to review the code, understand the APIs used, and adapt it to fit specific requirements or integrate it into a larger application.

This project was developed solely by me. 
