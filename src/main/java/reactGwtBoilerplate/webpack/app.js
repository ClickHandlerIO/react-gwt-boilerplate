import React from "react";
import ReactDOM from "react-dom";
import ReactTransitionGroup from "react/lib/ReactTransitionGroup";
import ReactCssTransitionGroup from "react/lib/ReactCSSTransitionGroup";
import injectTapEventPlugin from "react-tap-event-plugin";
import AppBar from "material-ui/lib/app-bar";
import AutoComplete from "material-ui/lib/auto-complete";
import Avatar from "material-ui/lib/avatar";
import Badge from "material-ui/lib/badge";
import Card from "material-ui/lib/card/card";
import CircularProgress from "material-ui/lib/circular-progress";
import Checkbox from "material-ui/lib/checkbox";
import Colors from "material-ui/lib/styles/colors";
import ColorManipulator from "material-ui/lib/utils/color-manipulator";
import DatePicker from "material-ui/lib/date-picker/date-picker";
import Dialog from "material-ui/lib/dialog";
import Divider from "material-ui/lib/divider";
import DropDownMenu from "material-ui/lib/drop-down-menu";
import FlatButton from "material-ui/lib/flat-button";
import FloatingActionButton from "material-ui/lib/floating-action-button";
import FontIcon from "material-ui/lib/font-icon";
import GridList from "material-ui/lib/grid-list/grid-list";
import IconButton from "material-ui/lib/icon-button";
import IconMenu from "material-ui/lib/menus/icon-menu";
import LeftNav from "material-ui/lib/left-nav";
import LinearProgress from "material-ui/lib/linear-progress";
import List from "material-ui/lib/lists/list";
import ListItem from "material-ui/lib/lists/list-item";
import Menu from "material-ui/lib/menus/menu";
import MenuItem from "material-ui/lib/menus/menu-item";
import MuiTheme from "material-ui/lib/styles/getMuiTheme";
import Paper from "material-ui/lib/paper";
import Popover from "material-ui/lib/popover/popover";
import RadioButton from "material-ui/lib/radio-button";
import RadioButtonGroup from "material-ui/lib/radio-button-group";
import RefreshIndicator from "material-ui/lib/refresh-indicator";
import SelectField from "material-ui/lib/select-field";
import Slider from "material-ui/lib/slider";
import Snackbar from "material-ui/lib/snackbar";
import Spacing from "material-ui/lib/styles/spacing";
import SvgIcon from "material-ui/lib/svg-icon";
import Tab from "material-ui/lib/tabs/tab";
import Tabs from "material-ui/lib/tabs/tabs";
import Table from "material-ui/lib/table/table";
import TableRow from "material-ui/lib/table/table-row";
import TableRowColumn from "material-ui/lib/table/table-row-column";
import TableHeader from "material-ui/lib/table/table-header";
import TableHeaderColumn from "material-ui/lib/table/table-header-column";
import TableBody from "material-ui/lib/table/table-body";
import TableFooter from "material-ui/lib/table/table-footer";
import TextField from "material-ui/lib/TextField/TextField";
import TimePicker from "material-ui/lib/time-picker/time-picker";
import Toolbar from "material-ui/lib/toolbar/toolbar";
import ToolbarGroup from "material-ui/lib/toolbar/toolbar-group";
import ToolbarSeparator from "material-ui/lib/toolbar/toolbar-separator";
import ToolbarTitle from "material-ui/lib/toolbar/toolbar-title";
import Toggle from "material-ui/lib/toggle";
import Typography from "material-ui/lib/styles/typography";
import RaisedButton from "material-ui/lib/raised-button";
import ZIndex from "material-ui/lib/styles/zIndex";
import AccountBoxSvgIcon from "material-ui/lib/svg-icons/action/account-box";
import AccountCircleSvgIcon from "material-ui/lib/svg-icons/action/account-circle";
import AddSvgIcon from "material-ui/lib/svg-icons/content/add";
import AddBoxSvgIcon from "material-ui/lib/svg-icons/content/add-box";
import AddCircleSvgIcon from "material-ui/lib/svg-icons/content/add-circle";
import AddCircleOutlineSvgIcon from "material-ui/lib/svg-icons/content/add-circle-outline";
import AddShoppingCartSvgIcon from "material-ui/lib/svg-icons/action/add-shopping-cart";
import ArchiveSvgIcon from "material-ui/lib/svg-icons/content/archive";
import ArrowDropDownSvgIcon from "material-ui/lib/svg-icons/navigation/arrow-drop-down";
import ArrowDropUpSvgIcon from "material-ui/lib/svg-icons/navigation/arrow-drop-up";
import AttachFileSvgIcon from "material-ui/lib/svg-icons/editor/attach-file";
import CheckSvgIcon from "material-ui/lib/svg-icons/navigation/check";
import CheckCircleSvgIcon from "material-ui/lib/svg-icons/action/check-circle";
import ChevronLeftSvgIcon from "material-ui/lib/svg-icons/navigation/chevron-left";
import ChevronRightSvgIcon from "material-ui/lib/svg-icons/navigation/chevron-right";
import CloseSvgIcon from "material-ui/lib/svg-icons/navigation/close";
import CloudDownloadSvgIcon from "material-ui/lib/svg-icons/file/cloud-download";
import CloudUploadSvgIcon from "material-ui/lib/svg-icons/file/cloud-upload";
import DeleteSvgIcon from "material-ui/lib/svg-icons/action/delete";
import DragHandleSvgIcon from "material-ui/lib/svg-icons/editor/drag-handle";
import EmailSvgIcon from "material-ui/lib/svg-icons/communication/email";
import FileDownloadSvgIcon from "material-ui/lib/svg-icons/file/file-download";
import FileUploadSvgIcon from "material-ui/lib/svg-icons/file/file-upload";
import FilterListSvgIcon from "material-ui/lib/svg-icons/content/filter-list";
import GpsFixedSvgIcon from "material-ui/lib/svg-icons/device/gps-fixed";
import InsertDriveFileSvgIcon from "material-ui/lib/svg-icons/editor/insert-drive-file";
import KeyboardArrowDownSvgIcon from "material-ui/lib/svg-icons/hardware/keyboard-arrow-down";
import LaunchSvgIcon from "material-ui/lib/svg-icons/action/launch";
import MailOutlineSvgIcon from "material-ui/lib/svg-icons/communication/mail-outline";
import MenuSvgIcon from "material-ui/lib/svg-icons/navigation/menu";
import MoreHorizSvgIcon from "material-ui/lib/svg-icons/navigation/more-horiz";
import MoreVertSvgIcon from "material-ui/lib/svg-icons/navigation/more-vert";
import NotificationsSvgIcon from "material-ui/lib/svg-icons/social/notifications";
import PersonAddSvgIcon from "material-ui/lib/svg-icons/social/person-add";
import PowerSettingsNewSvgIcon from "material-ui/lib/svg-icons/action/power-settings-new";
import PrintSvgIcon from "material-ui/lib/svg-icons/action/print";
import ReplySvgIcon from "material-ui/lib/svg-icons/content/reply";
import RemoveCircleSvgIcon from "material-ui/lib/svg-icons/content/remove-circle";
import RemoveCircleOutlineSvgIcon from "material-ui/lib/svg-icons/content/remove-circle-outline";
import SearchSvgIcon from "material-ui/lib/svg-icons/action/search";
import SendSvgIcon from "material-ui/lib/svg-icons/content/send";
import StorageSvgIcon from "material-ui/lib/svg-icons/device/storage";
import UnarchiveSvgIcon from "material-ui/lib/svg-icons/content/unarchive";
import {Router, browserHistory, hashHistory} from "react-router";

window.React = React;
window.ReactDOM = ReactDOM;
window.ReactTransitionGroup = ReactTransitionGroup;
window.ReactCssTransitionGroup = ReactCssTransitionGroup;

window.ReactRouter = {
    browserHistory: browserHistory,
    hashHistory: hashHistory,
    Router: Router
};

window.MaterialUi = {
    AppBar: AppBar,
    AutoComplete: AutoComplete,
    Avatar: Avatar,
    Badge: Badge,
    Card: Card,
    CircularProgress: CircularProgress,
    Checkbox: Checkbox,
    DatePicker: DatePicker,
    Dialog: Dialog,
    Divider: Divider,
    DropDownMenu: DropDownMenu,
    GridList: GridList,
    FlatButton: FlatButton,
    FloatingActionButton: FloatingActionButton,
    FontIcon: FontIcon,
    IconButton: IconButton,
    IconMenu: IconMenu,
    LeftNav: LeftNav,
    LinearProgress: LinearProgress,
    List: List,
    ListItem: ListItem,
    Menu: Menu,
    MenuItem: MenuItem,
    Paper: Paper,
    Popover: Popover,
    RadioButton: RadioButton,
    RadioButtonGroup: RadioButtonGroup,
    RaisedButton: RaisedButton,
    RefreshIndicator: RefreshIndicator,
    SelectField: SelectField,
    Slider: Slider,
    Snackbar: Snackbar,
    SvgIcon: SvgIcon,
    Tab: Tab,
    Tabs: Tabs,
    Table: Table,
    TableRow: TableRow,
    TableRowColumn: TableRowColumn,
    TableHeader: TableHeader,
    TableHeaderColumn: TableHeaderColumn,
    TableBody: TableBody,
    TableFooter: TableFooter,
    TextField: TextField,
    TimePicker: TimePicker,
    Toolbar: Toolbar,
    ToolbarGroup: ToolbarGroup,
    ToolbarSeparator: ToolbarSeparator,
    ToolbarTitle: ToolbarTitle,
    Toggle: Toggle,
    Icons: {
        AccountBox: AccountBoxSvgIcon,
        AccountCircle: AccountCircleSvgIcon,
        Add: AddSvgIcon,
        AddBox: AddBoxSvgIcon,
        AddCircle: AddCircleSvgIcon,
        AddCircleOutline: AddCircleOutlineSvgIcon,
        AddShoppingCart: AddShoppingCartSvgIcon,
        Archive: ArchiveSvgIcon,
        ArrowDropUp: ArrowDropUpSvgIcon,
        ArrowDropDown: ArrowDropDownSvgIcon,
        AttachFile: AttachFileSvgIcon,
        Check: CheckSvgIcon,
        CheckCircle: CheckCircleSvgIcon,
        ChevronLeft: ChevronLeftSvgIcon,
        ChevronRight: ChevronRightSvgIcon,
        CloudDownload: CloudDownloadSvgIcon,
        CloudUpload: CloudUploadSvgIcon,
        Close: CloseSvgIcon,
        Delete: DeleteSvgIcon,
        DragHandle: DragHandleSvgIcon,
        Email: EmailSvgIcon,
        FileDownload: FileDownloadSvgIcon,
        FileUpload: FileUploadSvgIcon,
        FilterList: FilterListSvgIcon,
        GpsFixed: GpsFixedSvgIcon,
        InsertDriveFile: InsertDriveFileSvgIcon,
        KeyboardArrowDown: KeyboardArrowDownSvgIcon,
        Launch: LaunchSvgIcon,
        MailOutline: MailOutlineSvgIcon,
        Menu: MenuSvgIcon,
        MoreHoriz: MoreHorizSvgIcon,
        MoreVert: MoreVertSvgIcon,
        Notifications: NotificationsSvgIcon,
        PersonAdd: PersonAddSvgIcon,
        PowerSettingsNew: PowerSettingsNewSvgIcon,
        Print: PrintSvgIcon,
        Reply: ReplySvgIcon,
        RemoveCircle: RemoveCircleSvgIcon,
        RemoveCircleOutline: RemoveCircleOutlineSvgIcon,
        Search: SearchSvgIcon,
        Send: SendSvgIcon,
        Storage: StorageSvgIcon,
        Unarchive: UnarchiveSvgIcon
    },
    Styles: {
        Colors: Colors,
        MuiTheme: MuiTheme,
        Spacing: Spacing,
        Typography: Typography,
        ZIndex: ZIndex
    },
    Utils: {
        ColorManipulator: ColorManipulator
    }
};
injectTapEventPlugin();