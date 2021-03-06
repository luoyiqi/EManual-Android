package io.github.emanual.app.utils;

import android.content.Context;

import java.io.File;

/**
 * Author: jayin
 * Date: 1/20/16
 */
public class AppPath {
    /**
     * 获取应用files/ 目录：/data/data/<App Name>/files
     * @param context
     * @return
     */
    public static String getAppFilesPath(Context context){
        return context.getFilesDir().getAbsolutePath();
    }
    /**
     * 获取文档下载目录,/data/data/<App Name>/files/download
     * @param context
     * @return
     */
    public static String getDownloadPath(Context context){
        return getAppFilesPath(context) + File.separator + "download";
    }
    /**
     * 获取文档目录,/data/data/<App Name>/files/books
     * @param context
     * @return
     */
    public static String getBooksPath(Context context){
        return getAppFilesPath(context) + File.separator + "books";
    }

    /**
     * 获取文档目录,/data/data/<App Name>/files/interviews
     * @param context
     * @return
     */
    public static String getInterviewsPath(Context context){
        return getAppFilesPath(context) + File.separator + "interviews";
    }

    //========Book

    /**
     * 获取教程的根目录/data/data/<App Name>/files/books/<bookName>
     * @param context
     * @param bookName 书名
     * @return
     */
    public static String getBookRootPath(Context context, String bookName){
        return getBooksPath(context) + File.separator + bookName;
    }

    /**
     * 获取教程的book目录：/data/data/<App Name>/files/books/<bookName>/book
     * @param context
     * @param bookname
     * @return
     */
    public static String getBookPath(Context context, String bookname) {
        return getBookRootPath(context, bookname) + File.separator + "book";
    }
    /**
     * 获取教程的book.json /data/data/<App Name>/files/books/<bookName>/book/book.json
     * @param context
     * @return
     */
    public static String getBookJSONFilePath(Context context, String bookName){
        return getBookPath(context, bookName) + File.separator + "book.json";
    }

    //=========== Interview

    /**
     * 获取Interview的根目录/data/data/<App Name>/files/interviews/<interviewName>
     * @param context
     * @param interviewName
     * @return
     */
    public static String getInterviewRootPath(Context context, String interviewName){
        return getInterviewsPath(context) + File.separator + interviewName;
    }

    /**
     * 获取Interview的Interview目录：/data/data/<App Name>/files/books/<bookName>/interview
     * @param context
     * @param interviewName
     * @return
     */
    public static String getInterviewPath(Context context, String interviewName) {
        return getInterviewRootPath(context, interviewName) + File.separator + "interview";
    }

    /**
     * 获取Interview的questions目录/data/data/<App Name>/files/interviews/<interviewName>/interview/questions
     * @param context
     * @param interviewName
     * @return
     */
    public static String getInterviewQuestionsRootPath(Context context, String interviewName){
        return getInterviewPath(context, interviewName) + File.separator + "questions";
    }

    /**
     * 获取教程的interview.json /data/data/<App Name>/files/books/<bookName>/interview/interview.json
     * @param context
     * @param interviewName
     * @return
     */
    public static String getInterviewJSONFilePath(Context context, String interviewName){
        return getInterviewPath(context, interviewName) + File.separator + "interview.json";
    }

    /**
     * 获取教程的入口文件(index.html)
     * /data/data/<App Name>/files/books/<bookName>/book/index.html
     * @param context
     * @param bookName 书名
     * @return
     */
    public static String getBookIndexURL(Context context, String bookName){
        return "file:///"+getBookPath(context, bookName) + File.separator + "index.html";
    }
}
