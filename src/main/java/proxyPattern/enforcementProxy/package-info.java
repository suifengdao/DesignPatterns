/**
 * 
 */
/**
 * @author TGP
 * @version 强制代理
 * 	不论你是通过代理类还是直接new一个主题角色类，都不能访问，
 * 	只有通过真实角色指定的代理类才可以访问，也就是说由真实角色管理代理角色。
 * 	这么说吧，高层模块new了一个真实角色的对象，返回的却是代理角色。
 * 
 * 可以对代理的行为进行修改。增加代理的 个性方法
 */
package proxyPattern.enforcementProxy;