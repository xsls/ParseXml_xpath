package com.sanyinchen.demo;

public class XmlObject {
String mtitle;//标题
String link;//链接
String comments;//评论
String pubDate;//提交日期
String creator;//作者
String description;//描述
String category;//分类

public XmlObject(String mtitle, String link, String comments, String pubDate,
		String creator, String description, String category) {
	super();
	this.mtitle = mtitle;
	this.link = link;
	this.comments = comments;
	this.pubDate = pubDate;
	this.creator = creator;
	this.description = description;
	this.category = category;
}
public String getMtitle() {
	return mtitle;
}
public void setMtitle(String mtitle) {
	this.mtitle = mtitle;
}
public String getLink() {
	return link;
}
public void setLink(String link) {
	this.link = link;
}
public String getComments() {
	return comments;
}
public void setComments(String comments) {
	this.comments = comments;
}
public String getPubDate() {
	return pubDate;
}
public void setPubDate(String pubDate) {
	this.pubDate = pubDate;
}
public String getCreator() {
	return creator;
}
public void setCreator(String creator) {
	this.creator = creator;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}

}
