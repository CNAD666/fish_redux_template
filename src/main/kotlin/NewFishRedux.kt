import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.DialogPanel
import com.intellij.openapi.ui.ValidationInfo
import com.intellij.ui.components.dialog
import com.intellij.ui.layout.cellPanel
import com.intellij.ui.layout.panel
import javax.swing.JComponent

/**
 * @Author: 余涛
 * @Features: 请描述文件的功能特征
 * @Time: 2020/10/19 16:03
 */
class NewFishRedux : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        initView()
    }

    private fun initView() {
        //设置dialog的具体布局
        var dialogView = setDialogLayout()

        //展示dialog布局
        showDialog(dialogView)
    }

    private fun setDialogLayout(): DialogPanel {
        return panel {
            //垂直布局
            row("Select  Module") {
                label(text = "测试")
                right { label(text = "我是大帅比") }
            }



            titledRow("Appearance") {
                row("Select  Module") {
                    label(text = "测试")
                    right { label(text = "我是大帅比") }
                }
            }

            row("Select  Module") {
                label(text = "测试")
                right { label(text = "我是大帅比") }
            }
        }
    }

    private fun showDialog(view: JComponent) {
        var reduxDialog = dialog(
            title = "Fish Redux Code Generation",
            panel = view,
            ok = {

                dialog(title = "测试Ok回调", panel = panel{ row { label("测试回调") }})

                test()
            }
        ).show()

    }

    private fun test(): List<ValidationInfo> {
        val list = mutableListOf<ValidationInfo>()

        list.add(ValidationInfo("测试OK回调"))
        return list
    }
}