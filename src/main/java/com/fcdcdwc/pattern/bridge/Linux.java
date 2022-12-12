package com.fcdcdwc.pattern.bridge;

/**
 * @version v1.0
 * @ClassName: Windows
 * @Description: 扩展抽象化角色(windows操作系统)
 * @Author: fcdcdwc
 */
public class Linux extends OpratingSystem {

    public Linux(VideoFile videoFile) {
        super(videoFile);
    }

    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
