package com.jtfr.chapter224;

/**
 * 抽象工厂模式
 * 1. 提供一个创建一系列相关或互相依赖对象的接口，无须指定它们的具体类。
 * 2. 客户端不依赖与产品类实例如何创建、如何被实现等细节，强调是一系列相关的产品对象，一起使用创建对象需要大量重复的代码。
 * 3. 需要提供一个产品类的库，所有的产品以同样的接口出现，从而使客户端不依赖具体的实现。
 * 理解：
 * 1. 抽象工厂定义了一系列的抽象方法，具体的抽象方法实现由不管.
 * 缺点
 * 1. 抽象工厂规定了可能被创建的产品集合，产品族中扩展新的产品困难，需要修改抽象工厂的接口。
 * 2. 增加了系统的抽象程度和理解难度。
 * 实际应用
 * 1. 千万不能“强迫症”甚至“有洁癖”。实际需求汇总，产品登记结构升级是非常正常的意见事情。
 * 2. 只要不平升级，根据实际情况可以不遵循开闭原则，代码半年升级一次或者一年升级一次也是可以的。
 */
public class AbastractFactoryPattern {

}