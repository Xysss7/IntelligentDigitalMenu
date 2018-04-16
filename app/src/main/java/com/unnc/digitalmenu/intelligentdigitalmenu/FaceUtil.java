package com.unnc.digitalmenu.intelligentdigitalmenu;

/**
 * Created by xys_0329 on 2018/4/15.
 */

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
/*
import com.megvii.cloud.http.CommonOperate;
import com.megvii.cloud.http.FaceSetOperate;
import com.megvii.cloud.http.Response;
*/
/*
public class FaceUtil {

    //正式key
    private static String apiKey     = "替换成你自己申请的apikey";
    private static String apiSecret  = "替换成你自己的apisecret";
    //用initFaceSet()生成  用于存储所有学生的人脸
    private static String FaceSetToken="用initFaceSet()生成得到";
    //用initTempFaceSet()生成 用于进行人脸比对签到存储的临时人脸，每次上传新合照，其人脸都会清空重新添加
    private static String TempFaceSetToken="用initTempFaceSet()生成";

//  private static String imgPath = "F:/face/IMG_20161006_181034.jpg";
//  private static String imgPath2= "F:/face/IMG_20170612_163951.jpg";
//  private static String hezhao= "F:/face/IMG_20170119_083458.jpg";

    /**
     * Function:
     *      获取图片的二进制文件
     * @DateTime 2017年12月5日下午5:51:18
     */

/*
    public static byte[] getBytesFromFile(File f) {
        if (f == null) {
            return null;
        }
        try {
            FileInputStream stream = new FileInputStream(f);
            ByteArrayOutputStream out = new ByteArrayOutputStream(1000);
            byte[] b = new byte[1000];
            int n;
            while ((n = stream.read(b)) != -1)
                out.write(b, 0, n);
            stream.close();
            out.close();
            return out.toByteArray();
        } catch (IOException e) {

        }
        return null;
    }

    /**
     * Function:
     *      获取图片的faceToken（数量可能为0）
     * @DateTime 2017年12月5日下午5:38:39
     */


/*
    public static List<String> getFaceToken(String imagePath){
        File file = new File(imagePath);
        byte[] fileByte = getBytesFromFile(file);
        List<String> faceTokens = new ArrayList<String>();
        CommonOperate commonOperate = new CommonOperate(apiKey, apiSecret, false);
        try {
            Response response = commonOperate.detectByte(fileByte, 0, "");
            String result = new String(response.getContent(),"UTF-8");
            if(response.getStatus() == 200) {//当请求正确回复时处理
                JSONObject jsonObject = new JSONObject(result);
                JSONArray faces = jsonObject.getJSONArray("faces");
                for(int i = 0; i < faces.length(); i++) {
                    JSONObject face = faces.getJSONObject(i);
                    faceTokens.add(face.getString("face_token"));
                }
            }else{//出现错误时打印错误信息
                System.out.println(response.getStatus() + "\n" +result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return faceTokens;
    }

    /**
     * Function:
     *      人脸比对(返回识别到的人脸的token)默认为空
     * @DateTime 2017年12月6日下午1:45:46
     */
/*
    public static String searchByFaceSetToken(String faceToken){
        CommonOperate commonOperate = new CommonOperate(apiKey, apiSecret, false);
        String face_token = null;
        try {
            Response response = commonOperate.searchByFaceSetToken(faceToken, null, null, FaceSetToken, 1);
            String result = new String(response.getContent(),"UTF-8");
            if(response.getStatus() == 200) {//当请求正确回复时处理
                JSONObject jsonObject = new JSONObject(result);
                JSONArray resultArray = jsonObject.getJSONArray("results");
                JSONObject face1 = resultArray.getJSONObject(0);
                double confidence = face1.getDouble("confidence");
                if(confidence > 80) {//判断人脸识别率高于80时，认为是同一个人，可以自己设置
                    face_token = face1.getString("face_token");
                }
            }else{//出现错误时打印错误信息
                System.out.println(response.getStatus() + "\n" +result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return face_token;
    }
*/
    /**
     * Function:
     *      将facetoken放入faceSet中，多张人脸token用逗号隔开
     * @DateTime 2017年12月5日下午5:38:43
     */
    /*
    public static boolean addFace2Set(String faceToken, String faceSetToken){
        FaceSetOperate faceSetOperate = new FaceSetOperate(apiKey, apiSecret, false);
        try {
            Response response = faceSetOperate.addFaceByFaceToken(faceToken, faceSetToken);
            String result = new String(response.getContent(),"UTF-8");
            if(response.getStatus() == 200) {//当请求正确回复时处理
                JSONObject jsonObject = new JSONObject(result);
                int added = jsonObject.getInt("face_added");
                if(added > 0) {
                    return true;
                }
            }else{//出现错误时打印错误信息
                System.out.println(response.getStatus() + "\n" +result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * Function:
     *      将facetoken从faceset中移除
     *      注：face_tokens字符串传入“RemoveAllFaceTokens”则会移除FaceSet内所有的face_token
     * @DateTime 2017年12月6日下午1:11:53
     */
    /*
    public static boolean removeFaceFromSet(String faceToken, String faceSetToken){
        FaceSetOperate faceSetOperate = new FaceSetOperate(apiKey, apiSecret, false);
        try {
            Response response = faceSetOperate.removeFaceFromFaceSetByFaceSetToken(faceSetToken, faceToken);
            String result = new String(response.getContent(),"UTF-8");
            if(response.getStatus() == 200) {//当请求正确回复时处理
                JSONObject jsonObject = new JSONObject(result);
                int removed = jsonObject.getInt("face_removed");
                if(removed > 0) {
                    return true;
                }
            }else{//出现错误时打印错误信息
                System.out.println(response.getStatus() + "\n" +result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * Function:
     *      移除FaceSet中的所有facetoken
     * @DateTime 2017年12月20日下午2:18:35
     */
    /*
    public static boolean removeAllFaceFromSet(String faceSetToken){
        FaceSetOperate faceSetOperate = new FaceSetOperate(apiKey, apiSecret, false);
        try {
            Response response = faceSetOperate.removeFaceFromFaceSetByFaceSetToken(faceSetToken, "RemoveAllFaceTokens");
            String result = new String(response.getContent(),"UTF-8");
            if(response.getStatus() == 200) {//当请求正确回复时处理
                JSONObject jsonObject = new JSONObject(result);
                int face_count = jsonObject.getInt("face_count");
                if(face_count == 0) {
                    return true;
                }
            }else{//出现错误时打印错误信息
                System.out.println(response.getStatus() + "\n" +result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * Function:
     *      创建默认的faceset集合，只用创建一次
     * @DateTime 2017年12月5日下午4:22:51
     */
    /*
    public static void initFaceSet() {
        String displayName = "人脸库";
        String outerId = "studentFace";
        String tags ="student";
        String FaceTokens = "bce2aa4f315afe95ec21811b72bd4cb4";//72小时内有效
        String userData =  "";
        int ForceMerge = 0;
        FaceSetOperate faceSetOperate = new FaceSetOperate(apiKey, apiSecret, false);
        try {
            Response response = faceSetOperate.createFaceSet(displayName, outerId, tags, FaceTokens, userData, ForceMerge);
            String result = new String(response.getContent(),"UTF-8");
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Function:
     *      初始化人脸比对临时库，只用创建一次
     * @DateTime 2017年12月6日下午1:34:55
     */
    /*
    public static void initTempFaceSet() {
        String displayName = "人脸比对临时库";
        String outerId = "tempFace";
        String tags ="tempFace";
        String FaceTokens = "705d1c857ca50a028355bc138198a018";//72小时内有效
        String userData =  "";
        int ForceMerge = 0;
        FaceSetOperate faceSetOperate = new FaceSetOperate(apiKey, apiSecret, false);
        try {
            Response response = faceSetOperate.createFaceSet(displayName, outerId, tags, FaceTokens, userData, ForceMerge);
            String result = new String(response.getContent(),"UTF-8");
            System.out.println(response.getStatus());
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //List<String> faceTokens = getFaceToken(hezhao);
        //String FaceTokens = "e4647d61eaa4b44b0f28521f17320d83";
        //searchByFaceSetToken(FaceTokens);
        //initTempFaceSet();
        //addFace2Set("37a4b7f212e78171a2939321ffba5817", TempFaceSetToken);
        //removeFaceFromSet(FaceTokens, TempFaceSetToken);
        //removeAllFaceFromSet(FaceSetToken);
    }
}
*/