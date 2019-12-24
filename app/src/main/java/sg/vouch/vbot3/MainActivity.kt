package sg.vouch.vbot3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import rizky.rockerdx.picbayloader.PixaBayActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener() { v ->
            Toast.makeText(this, "Ok!", Toast.LENGTH_LONG).show()

            val intent = Intent(this,PixaBayActivity::class.java)
            intent.putExtra(PixaBayActivity.INTENT.key,"14722032-068323abc9a77b7bc19fbd5d4")
            intent.putExtra(PixaBayActivity.INTENT.query,"flower") // this parameter will be used as query on pixabay
            intent.putExtra(PixaBayActivity.INTENT.collumn,3) // no of column displayed in the list
            startActivity(intent)
        }
    }
}
