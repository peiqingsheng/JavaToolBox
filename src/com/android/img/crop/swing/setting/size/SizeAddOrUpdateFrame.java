package com.android.img.crop.swing.setting.size;

import com.android.img.crop.model.Config;
import com.android.img.crop.model.ConfigItem;
import com.android.img.crop.swing.setting.SettingFrameGUI;

import javax.swing.*;
import java.awt.*;

/**
 * <pre>
 *     author : 陈伟
 *     e-mail : chenwei@njbandou.com
 *     time   : 2018/11/13
 *     desc   : say something
 *     version: 1.0
 * </pre>
 */
public class SizeAddOrUpdateFrame extends JFrame {

    public SizeAddOrUpdateFrame(Config config, ConfigItem configItem) throws HeadlessException {
        setTitle(configItem == null ? "添加尺寸" : "修改尺寸");
        setContentPane(new SizeAddOrUpdateGUI(this,config,configItem).rootPanel);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();

        setLocationRelativeTo(getOwner());
        setVisible(true);
        setLocationRelativeTo(null);
    }
}
