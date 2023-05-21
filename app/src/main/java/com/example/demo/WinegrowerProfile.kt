import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.google.firebase.FirebaseApp
import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.QueryDocumentSnapshot
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext



class WinegrowerProfile() {
    var active: Boolean
    var address: String
    var approved: Boolean
    var btw: String
    var city: String
    var country: String
    var exciseNumber: String
    var name: String
    var phone: Int
    var id: String

    init {
        active = true
        address = ""
        approved = true
        btw = ""
        city = ""
        country = ""
        exciseNumber = ""
        name = ""
        phone = 0
        id = ""
    }
}

class WinegrowerPofileDAO {

    var winegrowerProfile = MutableLiveData<WinegrowerProfile>()

    fun getWinegrowerProfile(document: DocumentSnapshot?): WinegrowerProfile {

        var winegrowerProfile = WinegrowerProfile()

        winegrowerProfile.active = document!!.data!!.get("active") as Boolean

        winegrowerProfile.address = document!!.data!!.get("address").toString()

        winegrowerProfile.approved = document!!.data!!.get("Approved") as Boolean

        winegrowerProfile.btw = document!!.data!!.get("btw").toString()

        winegrowerProfile.city = document!!.data!!.get("city").toString()

        winegrowerProfile.country = document!!.data!!.get("country").toString()

        winegrowerProfile.exciseNumber = document!!.data!!.get("exciseNumber").toString()

        winegrowerProfile.name = document!!.data!!.get("name").toString()

        winegrowerProfile.phone = document!!.data!!.get("phone") as Int

        winegrowerProfile.id = document!!.data!!.get("id").toString()

        return winegrowerProfile

    }

    fun getWinegrowerProfile(snapshot: QueryDocumentSnapshot): WinegrowerProfile {


        var winegrowerProfile = WinegrowerProfile()

        winegrowerProfile.active = snapshot!!.data!!.get("active") as Boolean

        winegrowerProfile.address = snapshot!!.data!!.get("address").toString()

        winegrowerProfile.approved = snapshot!!.data!!.get("approved") as Boolean

        winegrowerProfile.btw = snapshot!!.data!!.get("btw").toString()

        winegrowerProfile.city = snapshot!!.data!!.get("city").toString()

        winegrowerProfile.country = snapshot!!.data!!.get("country").toString()

        winegrowerProfile.exciseNumber = snapshot!!.data!!.get("exciseNumber").toString()

        winegrowerProfile.name = snapshot!!.data!!.get("name").toString()

        winegrowerProfile.phone = snapshot!!.data!!.get("name") as Int

        winegrowerProfile.id = snapshot.id

        return winegrowerProfile

    }

    suspend fun getWinegrowerProfile(id: String): WinegrowerProfile {


        withContext(Dispatchers.IO) {
            val db = Firebase.firestore
            var ref = db.collection("winegrowers").document(id)
                .collection("winegrowerProfile")
                .document(id)
                .get()
                .addOnSuccessListener { documentReference ->
                    Log.d("debug", "")
                }
                .addOnFailureListener { e ->
                    Log.w("debug", "Error", e)
                }
                .await()

            var winegrowerProfileResult = getWinegrowerProfile(ref)

            winegrowerProfile.postValue(winegrowerProfileResult)
        }
        return winegrowerProfile.value!!
    }
}

