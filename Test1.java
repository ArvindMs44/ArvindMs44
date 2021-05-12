����   ; �  Test1  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LTest1; main ([Ljava/lang/String;)V  webdriver.chrome.driver  D:\chromedriver.exe
    java/lang/System   setProperty 8(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;  'org/openqa/selenium/chrome/ChromeDriver
  	  https://login.salesforce.com/   " ! org/openqa/selenium/WebDriver # $ get (Ljava/lang/String;)V   & ' ( manage )()Lorg/openqa/selenium/WebDriver$Options; * , + %org/openqa/selenium/WebDriver$Options - . window (()Lorg/openqa/selenium/WebDriver$Window; 0 2 1 $org/openqa/selenium/WebDriver$Window 3  maximize   5 6 7 getTitle ()Ljava/lang/String;	  9 : ; out Ljava/io/PrintStream; = java/lang/StringBuilder ? Chrome Page Title is: 
 < A  $
 < C D E append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 < G H 7 toString
 J L K java/io/PrintStream M $ println   O P 7 getCurrentUrl R Chrome Page URL is:  T //input[@id='username']
 V X W org/openqa/selenium/By Y Z xpath ,(Ljava/lang/String;)Lorg/openqa/selenium/By;   \ ] ^ findElement :(Lorg/openqa/selenium/By;)Lorg/openqa/selenium/WebElement; ` java/lang/CharSequence b 	kfnksfksk d f e org/openqa/selenium/WebElement g h sendKeys ([Ljava/lang/CharSequence;)V j //input[@id='password'] l dsgdgdf n //input[@id='Login'] d p q  click s //div[@id='error'] d u v 7 getText x Error Message is:    z {  close args [Ljava/lang/String; driver Lorg/openqa/selenium/WebDriver; Title Ljava/lang/String; URL Error_Message 
SourceFile 
Test1.java InnerClasses Options Window !               /     *� �    
                    	      ^     �� W� Y� L+�  +� % � ) � / +� 4 M� 8� <Y>� @,� B� F� I+� N N� 8� <YQ� @-� B� F� I+S� U� [ � _YaS� c +i� U� [ � _YkS� c +m� U� [ � o +r� U� [ � t :� 8� <Yw� @� B� F� I+� y �    
   >    	  
     (  /  E  L  b  {  �  �  �  �  �     4    � | }    � ~   / � � �  L � � �  �  � �   �    � �     *   �	 0   �	