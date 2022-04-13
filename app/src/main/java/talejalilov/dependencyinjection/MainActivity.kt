package talejalilov.dependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    //Field Inject
    @Inject
    val mikayil : Musicians?=null
    lateinit var emrah:Instrument
    lateinit var rauf : Band

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mikayil?.sing()

        val tale = Musicians(emrah, rauf)
    }
}