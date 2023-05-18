package com.example.shiba.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.shiba.R
import com.example.shiba.adapters.HomeHorAdapter
import com.example.shiba.adapters.HomeVerAdapter
import com.example.shiba.models.HomeHorModel
import com.example.shiba.models.HomeVerModel


class HomeFragment : Fragment() {
    lateinit var homeHorizontalRec: RecyclerView
    lateinit var homeVerticalRec:RecyclerView
    var homeHorModelList: List<HomeHorModel>? = null
    var homeHorAdapter: HomeHorAdapter? = null

    var homeVerModelList: List<HomeVerModel>? = null
    var homeVerAdapter: HomeVerAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        homeHorizontalRec = root.findViewById(R.id.home_hor_rec)
        homeHorModelList = ArrayList<HomeHorModel>()
        (homeHorModelList as ArrayList<HomeHorModel>).add(HomeHorModel(R.drawable.pizza, "Pizza"))
        (homeHorModelList as ArrayList<HomeHorModel>).add(HomeHorModel(R.drawable.hamburger, "Hamburger"))
        (homeHorModelList as ArrayList<HomeHorModel>).add(HomeHorModel(R.drawable.fries, "Fries"))
        (homeHorModelList as ArrayList<HomeHorModel>).add(HomeHorModel(R.drawable.ice_cream, "Ice Cream"))
        (homeHorModelList as ArrayList<HomeHorModel>).add(HomeHorModel(R.drawable.sandwich, "Sandwich"))
       // homeHorAdapter = HomeHorAdapter(requireActivity(), homeHorModelList!!)
        homeHorizontalRec.setAdapter(homeHorAdapter)
        homeHorizontalRec.setLayoutManager(
            LinearLayoutManager(
                activity,
                RecyclerView.HORIZONTAL,
                false
            )
        )
        homeHorizontalRec.setHasFixedSize(true)
        homeHorizontalRec.setNestedScrollingEnabled(false)


        homeVerticalRec = root.findViewById(R.id.home_ver_rec)
        homeVerModelList = ArrayList<HomeVerModel>()
        (homeVerModelList as  ArrayList<HomeVerModel>).add(HomeVerModel(R.drawable.pizza1,"Pizza","10:00 - 23:00","4.9","Min - Ksh200"));
        (homeVerModelList as  ArrayList<HomeVerModel>).add(HomeVerModel(R.drawable.pizza2,"Pizza","10:00 - 23:00","4.9","Min - Ksh200"));
        (homeVerModelList as  ArrayList<HomeVerModel>).add(HomeVerModel(R.drawable.pizza3,"Pizza","10:00 - 23:00","4.9","Min - Ksh200"));


        homeVerAdapter = HomeVerAdapter(requireActivity(), homeVerModelList!!)
        homeVerticalRec.setAdapter(homeVerAdapter)
        homeVerticalRec.setLayoutManager(
            LinearLayoutManager(
                activity,
                RecyclerView.VERTICAL,
                false
            )
        )
        homeVerticalRec.setHasFixedSize(true)
        homeVerticalRec.setNestedScrollingEnabled(false)
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()

    }
}