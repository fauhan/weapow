package com.inpows.weapow.city

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.inpows.weapow.R
import com.inpows.weapow.base.BaseActivity
import com.inpows.weapow.base.NavigationHost
import com.inpows.weapow.databinding.ActivityChangeCityBinding
import com.inpows.weapow.city.fragment.SelectedCityFragment


/**
 * @author Fauhan Handay Pugar (fauhan.pugar@dana.id)
 * @version SearchCityActivity, v 0.1 24/04/22 05.30 by Fauhan Handay Pugar
 */
class ChangeCityActivity: BaseActivity(), NavigationHost {

    private var _binding: ActivityChangeCityBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        _binding = ActivityChangeCityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        super.onCreate(savedInstanceState)
        //actionbar
        val actionbar = supportActionBar
        actionbar?.title = "Change City"
        //set back button
        actionbar?.setDisplayHomeAsUpEnabled(true)
        actionbar?.setDisplayHomeAsUpEnabled(true)

        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.container, SelectedCityFragment())
                .commit()
        }
    }

    override fun init() {

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    /**
     * Navigate to the given fragment.
     *
     * @param fragment       Fragment to navigate to.
     * @param addToBackstack Whether or not the current fragment should be added to the backstack.
     */
    override fun navigateTo(fragment: Fragment, addToBackstack: Boolean) {
        val transaction = supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, fragment)

        if (addToBackstack) {
            transaction.addToBackStack(null)
        }

        transaction.commit()
    }

}