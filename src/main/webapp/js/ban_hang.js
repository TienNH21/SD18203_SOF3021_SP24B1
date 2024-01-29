fetch("/ban-hang/get-list-hd-cho")
    .then(response => response.json())
    .then(dsHDCho => {
        let html = '';
        for (const hd of dsHDCho) {
            html += `<tr><td>${hd.id}</td>
                <td>${hd.khachHang.ten}</td>
                <td>${ hd.ngayMuaHang }</td>
                <td>
                    <a class="btn btn-primary" onclick="chon_hoa_don(${ hd.id })">Chọn</a>
                </td></tr>`;
        }
        document.getElementById("tbl_hd_cho").innerHTML = html;
    })

const pageSPCT = localStorage.getItem("pageSPCT") ?? 1;
const url = `/ban-hang/get-list-spct?page=${ pageSPCT }`;
fetch(url).then(response => response.json())
    .then(response => {
        let html = '';
        for (const spct of response.content) {
            html += `<tr><td>${spct.id}</td>
                <td>${spct.sanPham.ma}</td>
                <td>${spct.sanPham.ten}</td>
                <td>${spct.kichThuoc.ten}</td>
                <td>${spct.mauSac.ten}</td>
                <td>${spct.soLuong}</td>
                <td>${spct.donGia}</td>
                <td>
                    <a class="btn btn-primary" onclick="them_gio_hang(${ spct.id })">Chọn</a>
                </td></tr>`;
        }
        document.getElementById("tbl_spct").innerHTML = html;
        
        // paginationBarLoader(response);
    })

const chon_hoa_don = (hdId) => {
    console.log(hdId);
};

const paginationBarLoader = (pageNumber) => {
    console.log(pageSPCT)
    if (pageSPCT == 1) {
        $("#btn_prev_page").addClass("disabled");
    } else {
        $("#btn_prev_page").removeClass("disabled");
    }

    if (pageSPCT == pageNumber) {
        $("#btn_next_page").addClass("disabled");
    } else {
        $("#btn_next_page").removeClass("disabled");
    }
}

paginationBarLoader(1);
