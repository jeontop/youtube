����   4 T  Account  java/lang/Object balance I owner Ljava/lang/String; accountNumber <init> (Ljava/lang/String;)V Code
   
  ()V	    	    
     createAccountNumber ()I	   	  LineNumberTable LocalVariableTable this 	LAccount;
  !   java/lang/Math " # random ()DA.��     result withdraw (I)V	 * , + java/lang/System - . out Ljava/io/PrintStream; 0 잔액이 부족합니다.
 2 4 3 java/io/PrintStream 5  println value StackMapTable deposit 	printInfo ; java/lang/StringBuilder = ------
 : ? 
 
 : A B C append -(Ljava/lang/String;)Ljava/lang/StringBuilder; E  -------
 : G H I toString ()Ljava/lang/String; K 계좌번호 : 
 : M B N (I)Ljava/lang/StringBuilder; P 잔액:  getOwnerName 
SourceFile P8.java                   	      
      [     *� *+� *� **� � �           ?  C 	 E  G  K                          C     �  $k�<�       
    S 	 U             	  &    ' (     l     *� � *Y� d� � � )/� 1�           c  g  k  o  u                6   7      8 (     C     *Y� `� �       
    } 
 �                6    9      �     Q� )� :Y<� >*� � @D� @� F� 1� )� :YJ� >*� � L� F� 1� )� :YO� >*� � L� F� 1�           �  � 7 � P �        Q      Q I     /     *� �           �              R    S